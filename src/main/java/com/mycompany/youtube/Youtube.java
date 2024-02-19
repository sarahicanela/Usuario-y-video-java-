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
        
         Usuario usuario2=new Usuario("Amiguito");
        Comentario comment1=new Comentario(":quiero un arroz con leche ",usuario2);
        System.out.println("El usuario "+ usuario2.getNombre()+ "  publicó el comentario "+ comment1.getContenido() );
    }
}


