/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.youtube;

/**
 *
 * @author LAPONE
 */
public class Youtube {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("sarahi");
        Video video = new Video ("aprendiendo java", 2400,"http;//sarahi.co" );
        usuario.subirVideo(video);
        usuario.mostrarInfoUsuario();
    }
}


