package SuperExplorador_JAA;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author The Test
 */
public class MusicPlayer extends javax.swing.JFrame {

    /**
     * Creates new form MusicPlayer
     */
    
    
    
    JFileChooser selectorArchivos;
    File aReproducir;
    Clip sound;
    int loop = 0;
    Boolean para = false;
    int lastPosition = 0;
    
    public MusicPlayer(JFileChooser se) {
        
        selectorArchivos = se;
        initComponents();
        barraProgreso.setMinimum(0);
        barraProgreso.setMaximum(100);
        jSliderSong.setMinimum(0);
        jSliderSong.setMaximum(100);
        jSliderVolume.setMinimum(-30);
        jSliderVolume.setMaximum(6);
        jSliderVolume.setValue(-3);
        jLabelVisualizador.setEnabled(false);
        
        
        aReproducir = selectorArchivos.getSelectedFile();
      jLabelNombre.setText(aReproducir.getName());
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextFieldLoop = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonLoop = new javax.swing.JButton();
        jLabelLoop = new javax.swing.JLabel();
        barraProgreso = new javax.swing.JProgressBar();
        jSliderSong = new javax.swing.JSlider();
        jSliderVolume = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonPlay = new javax.swing.JButton();
        jButtonStop = new javax.swing.JButton();
        jButtonPause = new javax.swing.JToggleButton();
        jLabelVisualizador = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);

        jLabel1.setText("veces");

        jLabel2.setText("Repetir");

        jButtonLoop.setText("Asignar Loop");
        jButtonLoop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoopActionPerformed(evt);
            }
        });

        jSliderSong.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSliderSongStateChanged(evt);
            }
        });
        jSliderSong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jSliderSongMouseReleased(evt);
            }
        });
        jSliderSong.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jSliderSongPropertyChange(evt);
            }
        });

        jSliderVolume.setMaximum(6);
        jSliderVolume.setMinimum(-18);
        jSliderVolume.setOrientation(javax.swing.JSlider.VERTICAL);
        jSliderVolume.setToolTipText("VOLUMEN");
        jSliderVolume.setValue(8);

        jLabel3.setText("VOLUMEN");

        jButtonPlay.setText("PLAY");
        jButtonPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlayActionPerformed(evt);
            }
        });

        jButtonStop.setText("STOP");
        jButtonStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStopActionPerformed(evt);
            }
        });

        jButtonPause.setText("PAUSE");
        jButtonPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPauseActionPerformed(evt);
            }
        });

        jLabelVisualizador.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabelVisualizador.setMinimumSize(new java.awt.Dimension(1200, 764));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonStop, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButtonPause, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButtonPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jLabelVisualizador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelVisualizador, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPause, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonStop, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSliderSong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jButtonLoop)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldLoop, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jSliderVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelLoop, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(barraProgreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addComponent(jSliderVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addComponent(jLabelLoop, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLoop)
                    .addComponent(jTextFieldLoop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jSliderSong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barraProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButtonPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlayActionPerformed
        
        para = false;
        
        Thread t = new Thread() {
            @Override
            public void run() {
                jButtonPlay.setEnabled(false);
                while (!para) {
                    barraProgreso.setValue(0);
                    jSliderSong.setValue(0);
                    if (aReproducir == null) {
                        JOptionPane.showMessageDialog(null, "Selecciona un archivo de sonido");
                        jButtonPause.setSelected(false);
                        break;
                    } else {
                        
                        try {
                            sound = AudioSystem.getClip();
                            sound.open(AudioSystem.getAudioInputStream(aReproducir));
                            FloatControl gainControl
                                    = (FloatControl) sound.getControl(FloatControl.Type.MASTER_GAIN);
                            
                            gainControl.setValue((jSliderVolume.getValue()));
                            sound.setFramePosition(lastPosition);
                            int legthValue = (loop + 1) * 100;
                            barraProgreso.setMinimum(0);
                            barraProgreso.setMaximum(legthValue);
                            jSliderSong.setMinimum(0);
                            jSliderSong.setMaximum(legthValue);
                            sound.loop(loop);
                            jLabelVisualizador.setEnabled(true);
                            
                            while (!sound.isRunning()) {
                                Thread.sleep(10);
                                
                            }
                            while (sound.isRunning()) {
                                Thread.sleep(100);
                                
                                jSliderSong.setValue(sound.getFramePosition() / (sound.getFrameLength() / 100));
                                if (jSliderSong.getValueIsAdjusting()) {
                                    Thread.sleep(400);
                                    sound.setFramePosition((sound.getFrameLength() / 100) * jSliderSong.getValue());
                                }
                                if (jSliderVolume.getValueIsAdjusting()) {
                                    Thread.sleep(300);
                                    gainControl.setValue((jSliderVolume.getValue()));
                                }
                                Thread.sleep(100);
                                barraProgreso.setValue(sound.getFramePosition() / (sound.getFrameLength() / 100));
                                
                                if (jButtonPause.isSelected()) {
                                    lastPosition = sound.getFramePosition();
                                    sound.stop();
                                    
                                }
                                
                                if (para) {
                                    sound.stop();
                                }
                                
                                if (!sound.isRunning()) {
                                    
                                    jButtonPause.setSelected(false);
                                    para = true;
                                    jLabelVisualizador.setEnabled(false);
                                    jButtonPlay.setEnabled(true);
                                    sound.stop();
                                    
                                }
                            }
                            
                        } catch (LineUnavailableException ex) {
                            Logger.getLogger(MusicPlayer.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (UnsupportedAudioFileException ex) {
                            Logger.getLogger(MusicPlayer.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IOException ex) {
                            Logger.getLogger(MusicPlayer.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(MusicPlayer.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                    }
                    
                }
                
            }
            
        };
        
        t.start();
        System.out.println("Se paró la wea");
        
        barraProgreso.setValue(0);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPlayActionPerformed

    private void jButtonStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStopActionPerformed
        
        this.para = true;
        this.lastPosition = 0;
        jButtonPause.setSelected(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonStopActionPerformed

    private void jButtonLoopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoopActionPerformed
        loop = Integer.parseInt(jTextFieldLoop.getText()) - 1;
        int loopAmostrar = loop + 1;
        jLabelLoop.setText(loopAmostrar + "");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLoopActionPerformed

    private void jSliderSongPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jSliderSongPropertyChange

        // TODO add your handling code here:
    }//GEN-LAST:event_jSliderSongPropertyChange

    private void jSliderSongStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSliderSongStateChanged

        // TODO add your handling code here:
    }//GEN-LAST:event_jSliderSongStateChanged

    private void jSliderSongMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSliderSongMouseReleased

    }//GEN-LAST:event_jSliderSongMouseReleased

    private void jButtonPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPauseActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPauseActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraProgreso;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonLoop;
    private javax.swing.JToggleButton jButtonPause;
    private javax.swing.JButton jButtonPlay;
    private javax.swing.JButton jButtonStop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelLoop;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelVisualizador;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSliderSong;
    private javax.swing.JSlider jSliderVolume;
    private javax.swing.JTextField jTextFieldLoop;
    // End of variables declaration//GEN-END:variables
}