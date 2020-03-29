/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegopokemon;

/**
 *
 * @author Kevin'
 */
public class personajes {
     String nombre;
      int vida;
      int ataque;
      String estado;
      int ganadas;
      int perdidas;
      String imagen;

     public void peronsajes(){
     
     }
    
     public void setPokemon(String nuevo_nombre,int vidap,int ataquep,String estadop,int ganadasp,int perdidasp, String img){
     this.nombre = nuevo_nombre;
        this.vida = vidap;
        this.ataque = ataquep;
        this.estado = estadop;
        this.ganadas = ganadasp;
        this.perdidas = perdidasp;
        this.imagen = img;
     }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getGanadas() {
        return ganadas;
    }

    public void setGanadas(int ganadas) {
        this.ganadas = ganadas;
    }

    public int getPerdidas() {
        return perdidas;
    }

    public void setPerdidas(int perdidas) {
        this.perdidas = perdidas;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
     
     
      
 
     
      
    
      public void setName(String newName){
      this.nombre=newName; 
      }
     
      public void getImagen(String newImagen){
      this.nombre=newImagen;
      }
      
      public void danoVida(int dano ){
          vida = vida - dano;
      }
      
      public void imprimirBatalla(){
          
      }
      
     
              
     @Override
     public String toString(){

        return "";
    }
}
