/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegopokemon;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Kevin'
 */
public class JuegoPokemon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sn = new Scanner(System.in);
        boolean salir = false;
        
        int opcion; //Guardaremos la opcion del usuario
        int contraseña;
        int personaje1;
        int personaje2;
        int personaje3;
        int personaje4;
        int eleccion1;
        int eleccion2;
        int ataque1;
        int ataque2;
        int vida;
        int atack1;
        int menu;
        int menu2;
        menu2=0;
        menu=0;
        atack1 = (int) (Math.random() * 20) + 5;
        
        int atack2;
        atack2 = (int) (Math.random() * 20) + 5;
        
        int atack3;
        atack3 = (int) (Math.random() * 20) + 5;
        
        int atack4;
        atack4 = (int) (Math.random() * 20) + 5;
        
        int atack5;
        atack5 = (int) (Math.random() * 20) + 5;
        
        int atack6;
        atack6 = (int) (Math.random() * 20) + 5;
        
        int atack7;
        atack7 = (int) (Math.random() * 20) + 5;
        
        int atack8;
        atack8 = (int) (Math.random() *20) + 5;
        
        int vida1;
        vida1 = (int) (Math.random() * 50) + 50;
        
        int vida2;
        vida2 = (int) (Math.random() * 50) + 50;
        
        int vida3;
        vida3 = (int) (Math.random() * 50) + 50;
        
        int vida4;
        vida4 = (int) (Math.random() * 50) + 50;
        
        int vida5;
        vida5 = (int) (Math.random() * 50) + 50;
        
        int vida6;
        vida6 = (int) (Math.random() * 50) + 50;
        
        int vida7;
        vida7 = (int) (Math.random() * 50) + 50;
        
        int vida8;
        vida8 = (int) (Math.random() * 50) + 50;
        
        int vida_nueva1;
        vida_nueva1= (int) (Math.random() * 50) + 50;
        int vida_nueva2;
        vida_nueva2= (int) (Math.random() * 50) + 50;
        int vida_nueva3;
        vida_nueva3= (int) (Math.random() * 50) + 50;
        int vida_nueva4;
        vida_nueva4= (int) (Math.random() * 50) + 50;
        
        
        int new_atack1;
        new_atack1= (int) (Math.random() * 20) + 5;
        int new_atack2;
        new_atack2= (int) (Math.random() * 20) + 5;
        int new_atack3;
        new_atack3= (int) (Math.random() * 20) + 5;
        int new_atack4;
        new_atack4= (int) (Math.random() * 20) + 5;
        
        
        String modifica;
        String nombre_usuario1;
        String nombre_usuario2;
        
       personajes Pokemon1 = new personajes();
       personajes Pokemon2 = new personajes();
       personajes Pokemon3 = new personajes();
       personajes Pokemon4 = new personajes();
       personajes Pokemon5 = new personajes();
       personajes Pokemon6 = new personajes();
       personajes Pokemon7 = new personajes();
 
       Pokemon1.nombre = "Pikachu";
       Pokemon1.vida=vida1;
       Pokemon1.ataque=51;
       Pokemon1.estado="vivo";
       Pokemon1.ganadas=0;
       Pokemon1.perdidas=0;
       Pokemon1.imagen=" @                                     \n" +
"  @...                                 \n" +
"   @....               (....@@         \n" +
"     &.............&.......@           \n" +
"        .............*/        &....   \n" +
"       &..............&     .........  \n" +
"       .@@......@@@....  ............. \n" +
"      &@..........,(...    .******%    \n" +
"       ...........(((..     .**        \n" +
"        @...............     .*        \n" +
"       @....**,..,.....#   **          \n" +
"       .................&   %&         \n" +
"        ...@...&....,*... %            \n" +
"         ......#.......##%%            \n" +
"        .................              \n" +
"        ...****.........&              \n" +
"         .*@%   ******@                \n" +
"                   ,    ";
      
       
       Pokemon2.nombre = "Mewtwo";
       Pokemon2.vida=vida2;
       Pokemon2.ataque=atack2;
       Pokemon2.estado="vivo";
       Pokemon2.ganadas=0;
       Pokemon2.perdidas=0;
       Pokemon2.imagen=
"     @@@@@@@@@@@@@@@,.@@@.&@@@@@@@     \n" +
"     @@@@@@@@@@@@@@@..,..*@@@@@@@@     \n" +
"     @@@@@@@@@@@@@@...,...,@@@@@@@     \n" +
"     @@@@@@@@*.@@@@@../.,,@@@@@@@@     \n" +
"     @@@@@@@@@(*((@*%/*/,/@@@@@@@@     \n" +
"     @@@@@@...***..,,#...@@@@@@@@@     \n" +
"     @****@@@@@@@@@@....,,*@@@@@@@     \n" +
"     (@@@@//@@@@@@@@@@.,,@@@,,@@@@     \n" +
"     (@@@@@//@@@@@@@@@,,,,@@@@.@@@     \n" +
"     ((@@@@#//%@@@@*..../**/@@,..@     \n" +
"     @(/@@@@//////......////.@*@,,     \n" +
"     @@//*@@@/////..,,,(///#*@@@@@     \n" +
"     @@@/***&@@///,,,,(///**@@@@@@     \n" +
"     @@@@@***@@@@.,@@@@@@,@@@@@@@@     \n" +
"     @@@@@@@@@@@..@@@@@@(,@@@@@@@@     \n" +
"     @@@@@@@@@@..@@@@@@.,**&@@@@@@     \n" +
"     @@@@@@@@@..,,@@@@@@@@@**,*(@@     \n" +
"     @@@@@@@@...,.#@@@@@@@@@@@@@@@     \n" +
"                                        ";     
       
       
       
       Pokemon3.nombre = "Ivysaur";
       Pokemon3.vida=vida3;
       Pokemon3.ataque=atack3;
       Pokemon3.estado="vivo";
       Pokemon3.ganadas=0;
       Pokemon3.perdidas=0;
       Pokemon3.imagen=
"@@@@@@@@@@@@@@@@&%  &  @@@@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@@&%         @@@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@&        &   @@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@              @@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@      &       @@@@@@@@@@@@@\n" +
"@@@@@@@@@@@@@&            @@@@@@@@@@@@@\n" +
" &....& *@@@@@  ........    @@@@@@@@@@@\n" +
"@@@@&&@&         &***** &&      %    %@\n" +
"@@@@@@@@   ....**.****   @@@@@@@@@@@@@@\n" +
"@@@@@@@@@&   ...     .* @@@@@@@@@@@@@@@\n" +
"@@@@@@@@@   . .          .*@@@@@@@@@@@@\n" +
"@@@@@@@..   %      .     &  @@@@@@@@@@@\n" +
"@@@@@@@.      %  .  &        @@@@@@@@@@\n" +
"@@@@@@@@  %%         &  &&  .@@@@@@@@@@\n" +
"@@@@@@@@@   & &&&&&        & @@@@@@@@@@\n" +
"@@@@@@@@@        &@@@ .   & &@@@@@@@@@@\n" +
"                                        ";
       
       
       
       Pokemon4.nombre = "Jigglypuff";
       Pokemon4.vida=vida4;
       Pokemon4.ataque=atack4;
       Pokemon4.estado="vivo";
       Pokemon4.ganadas=0;
       Pokemon4.perdidas=0;
       Pokemon4.imagen=
"                                     \n" +
"      ..,.....*..........,,....//.     \n" +
"      ./%%%%%.....,...,....*%%%%%,     \n" +
"      *.%%(...................#%.      \n" +
"      /..........................      \n" +
"     *............,.......,.......     \n" +
"     .......,*......,............./    \n" +
"    ...... (((, *.......... (# ....    \n" +
"  ......./ *((*  (/.,,.*(/ ,((*....,   \n" +
" /........ /*//** *....*#//((***..,..  \n" +
"   ............* ......., .,.........  \n" +
"     *...........................,.    \n" +
"       .........................       \n" +
"         .....................*        \n" +
"           ,...............,.,         \n" +
"            ...,*.  ,***,.             \n" +
"                                        ";
       
       
       
       Pokemon5.nombre = "Chikorita";
       Pokemon5.vida=vida5;
       Pokemon5.ataque=atack5;
       Pokemon5.estado="vivo";
       Pokemon5.ganadas=0;
       Pokemon5.perdidas=0;
       Pokemon5.imagen=
"    *******/                           \n" +
"    #*************.                    \n" +
"   #   #********(***(                  \n" +
"         #*********(**                 \n" +
"           #*********/*                \n" +
"              (/*****(((               \n" +
"                      .(#*             \n" +
"                     ,,,.....*         \n" +
"                   ,%......# ..        \n" +
"                  .  ...... ( .,       \n" +
"                  . #..... #( ..       \n" +
"                  ...*****......*      \n" +
"                 (/....//........      \n" +
"                 *../........./.(      \n" +
"                 ......((.*(....*      \n" +
"              ,,*.,,,.............     \n" +
"               ..,,,,,.,.,,,,,,,,,,(   \n" +
"                .,,,,,,,,,,,,,.        \n" +
"                ,,,,,,,,,,,,,/         \n" +
"                ,/.      *,,,          \n" +
"                             ";
       
       
       
       Pokemon6.nombre = "Blastoise";
       Pokemon6.vida=vida6;
       Pokemon6.ataque=atack6;
       Pokemon6.estado="vivo";
       Pokemon6.ganadas=0;
       Pokemon6.perdidas=0;
       Pokemon6.imagen=
"        #                            \n" +
"     &&&& ***.  .                      \n" +
"     &&&% *********, ***/((            \n" +
"     ,   ..,*********&*,.((##          \n" +
"              .  ..,*****%%#         \n" +
"                       ##(##%##%       \n" +
"           ///&***//(   (/**/###&      \n" +
"          *///% #//(%      #(((##      \n" +
"          %///////,(#/#. % .    #%     \n" +
"    *#@   *.(*/(...///,  (*/// .##/    \n" +
"&&, @   /((#(...(//// *(&&&  &(/###    \n" +
"  %////*(((((( ,%,(/(@//# .*####*(   \n" +
"   .#&**(((%   /,...,,,.&*####&(*****  \n" +
"              **///((/(//////**////&*/ \n" +
"              ///((((&/////&&**//(/(%  \n" +
"              (((((((       ((((((((#%&\n" +
"               .,%,*,*      ,(,*&((%   \n" +
"                                       ";
       
       
       
       
       Pokemon7.nombre = "Metapod";
       Pokemon7.vida=vida7;
       Pokemon7.ataque=atack7;
       Pokemon7.estado="vivo";
       Pokemon7.ganadas=0;
       Pokemon7.perdidas=0;
       Pokemon7.imagen=
"                 .                    \n" +
"                  ..,,,                \n" +
"                  ...,*/               \n" +
"                   ...,*/              \n" +
"                   ...,,**/            \n" +
"                  ...,/****(           \n" +
"                 ,.* *@*,**/%          \n" +
"                ...,*.*#(*///(         \n" +
"               .. ,,,,*/,,**//#        \n" +
"             ..,,**,**,,,*,*/#/        \n" +
"                /**,/***../##          \n" +
"                /(***//(/(##           \n" +
"               (//****/(#(*            \n" +
"             ///////*/(((/             \n" +
"        ,,*////((/////##,              \n" +
"          (#((#%####(                  \n" +
"                                       ";

       
       
       personajes [] arreglo1= new personajes[7];
       arreglo1[0] =Pokemon1;
       arreglo1[1] =Pokemon2;
       arreglo1[2] =Pokemon3;
       arreglo1[3] =Pokemon4;
       arreglo1[4] =Pokemon5;
       arreglo1[5] =Pokemon6;
       arreglo1[6] =Pokemon7;
       
        
       System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
"@@@@@@@%##############################################################################################################################################%@@@@@@@@\n" +
"@@@@@####################################################################################################################################################@@@@@@\n" +
"@@@@@####################################################################################################################################################@@@@@@\n" +
"@@@@@####################################################################################################################################################@@@@@@\n" +
"@@@@@###         #,        ##  ###(  (#        /#        .#  #####  (         #         #         *#         #*        ######         ####/        (#####@@@@@@\n" +
"@@@@@###  #####. #  #####  (#  ##,  ###  ######## .#####  #  #####  ####. #####  #####  #######   ##  #####  #  (####/ /#####  #####  ####. #####, *#####@@@@@@\n" +
"@@@@@###  (((((  #  #####  (#      ####       ### .((((/  #  #####  ####. #####  (((((  #####   ####  #####  #.        ######        (####. (((((, *#####@@@@@@\n" +
"@@@@@###        ,#  #####  (#  (*  ####  (((((###        (#  #####  ####. #####         ###   ######  #####  ###(((((* /######((((((  ####.        *#####@@@@@@\n" +
"@@@@@###  ########  ,,,,,  (#  ###  ,##  ,,,,,,(# .########  ,,,,,  ####. #####  #####  #.  .,,,,,/#  ,,,,,  #  ,,,,,. /#####  ,,,,,  #(*(. #####, *#**##@@@@@@\n" +
"@@@@@###  #########       ,##  ####  .#        /# .########.       #####. #####  #####  #         *#*       (##        ######,       (#* (. #####, *#  ##@@@@@@\n" +
"@@@@@####################################################################################################################################################@@@@@@\n" +
"@@@@@####################################################################################################################################################@@@@@@\n" +
"@@@@@@##################################################################################################################################################&@@@@@@\n" +
"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            
            do{
            System.out.println("1. Administrador");
            System.out.println("2. Iniciar batalla");
            System.out.println("3. salir");
            
 
            
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                         System.out.println("Ingresar contraseña");
                         contraseña = sn.nextInt();
                         if(contraseña==201800596){
                             do{
                         System.out.println("1. Listado Pokemones");
                         System.out.println("2. Agregar Pokemon");
                         System.out.println("3. Editar Pokemon");
                         System.out.println("4. Reportes");
                         
                         System.out.println("Escribe una de las opciones");
                         opcion = sn.nextInt();
                        
                         switch (opcion) {
                                case 1:
                                
                                   try{
                                     for (int i=0;i <= arreglo1.length - 1;i++){
                                     System.out.println(i+1+". "+"pokemon: "+arreglo1[i].nombre + "   Vida:" +arreglo1[i].vida + "   Ataque: "+arreglo1[i].ataque);
                                     System.out.println(arreglo1[i].imagen);
                                     }}catch(Exception k){
       } 
                                   System.out.println("para regresar el menu adminstrador ingrese ");
                                   menu2 = sn.nextInt();
                                break;
                                case 2:
                                 
                                   System.out.println("Agrega");
                                   System.out.println("Ingresar la cantidad de pokemones a agregar");
                                   int cantidad = sn.nextInt();
                                   try{
                                    for (int n = 7; n <=cantidad +6; n++) {
                                           
                                       System.out.println("Nombre");
                                       
                                       String nombre_nuevo = sn.next();
                                       
                                       
                                        System.out.println
                                               ("                 .                    \n" +
                                                "                  ..,,,                \n" +
                                                "                  ...,*/               \n" +
                                                "                   ...,*/              \n" +
                                                "                   ...,,**/            \n" +
                                                "                  ...,/****(           \n" +
                                                "                 ,.* *@*,**/%          \n" +
                                                "                ...,*.*#(*///(         \n" +
                                                "               .. ,,,,*/,,**//#        \n" +
                                                "             ..,,**,**,,,*,*/#/        \n" +
                                                "                /**,/***../##          \n" +
                                                "                /(***//(/(##           \n" +
                                                "               (//****/(#(*            \n" +
                                                "             ///////*/(((/             \n" +
                                                "        ,,*////((/////##,              \n" +
                                                "          (#((#%####(                  \n" +
                                                "                                       ");

                                       System.out.println("Imagen");
                                       
                                       String nueva_imagen = sn.next();
                                       
                                       int vida_agregada;
                                       vida_agregada= (int) (Math.random() * 50) + 50;
                                        int ataque_agregado;
                                      ataque_agregado= (int) (Math.random() * 20) + 5;
                                       String estado_agregado ="vivo";
                                       int ganadas_agregadas=0;
                                       int perdidas_agregadas=0;
                                       personajes hola = new personajes();
                                       hola.setNombre(nombre_nuevo);
                                       hola.setVida(vida_agregada);
                                       hola.setAtaque(ataque_agregado);
                                       hola.setEstado(estado_agregado);
                                       hola.setGanadas(ganadas_agregadas);
                                       hola.setPerdidas(perdidas_agregadas);
                                       hola.setImagen(nueva_imagen);
                                               
                                              
                                             
                                       arreglo1[n]=hola;      
                                       
                                    }
                                   }catch(Exception l){
                                   }  
                                       
                                      
                                   try{
                                     for (int i=0;i <= arreglo1.length - 1;i++){
                                System.out.println(i+1+". "+"pokemon: "+arreglo1[i].nombre + " vida:" +arreglo1[i].vida + " araque: "+arreglo1[i].ataque);
                                     }
                                   }
                                   catch(Exception v){
                                   }
                                   break;
                                case 3:
                                    
                                System.out.println("pokemones");
                                for (int i=0;i <= arreglo1.length - 1;i++){
                                System.out.println(i+1+". "+"pokemon: "+arreglo1[i].nombre + " vida:" +arreglo1[i].vida + " araque: "+arreglo1[i].ataque);
                                  System.out.println("Digite 6 para regresar");
                                   menu2 = sn.nextInt();
                                
                                }
                                 System.out.println("ingrese numero de pokemon a modificar");
                                 opcion = sn.nextInt();
                                System.out.println("que nombre desea modificar");
                                  modifica = sn.next();
                                arreglo1[opcion-1].setName(modifica);
                                 for (int i=0;i <= arreglo1.length - 1;i++){
                                System.out.println(i+1+". "+"pokemon: "+arreglo1[i].nombre + " vida:" +arreglo1[i].vida + " araque: "+arreglo1[i].ataque);
                                
                                
                                
                                
                                }
                                break;
                                case 4:
                                    System.out.println("Estadisticas de partidas de pokemones");
                                         for (int i=0;i <= arreglo1.length - 1;i++){
                                System.out.println(i+1+". "+"========"+arreglo1[i].nombre+"========");
                                System.out.println(" partidas ganadas" +arreglo1[i].ganadas + " partidas perdidas: "+arreglo1[i].perdidas);
                                }        
                                         System.out.println("===Pokemones con más victoras===");
                                if((arreglo1[0].ganadas)>(arreglo1[1].ganadas & arreglo1[2].ganadas & arreglo1[3].ganadas & arreglo1[4].ganadas & arreglo1[5].ganadas & arreglo1[6].ganadas)){
                                             
                                            System.out.println(arreglo1[0].nombre);
                                        }
                                if((arreglo1[1].ganadas)>(arreglo1[0].ganadas & arreglo1[2].ganadas & arreglo1[3].ganadas & arreglo1[4].ganadas & arreglo1[5].ganadas & arreglo1[6].ganadas)){
                                             
                                            System.out.println(arreglo1[1].nombre);
                                        }
                              if((arreglo1[2].ganadas)>(arreglo1[1].ganadas & arreglo1[0].ganadas & arreglo1[3].ganadas & arreglo1[4].ganadas & arreglo1[5].ganadas & arreglo1[6].ganadas)){
                                             
                                            System.out.println(arreglo1[2].nombre);
                                        }
                                if((arreglo1[3].ganadas)>(arreglo1[1].ganadas & arreglo1[2].ganadas & arreglo1[0].ganadas & arreglo1[4].ganadas & arreglo1[5].ganadas & arreglo1[6].ganadas)){
                                             
                                            System.out.println(arreglo1[3].nombre);
                                        }
                                  if((arreglo1[4].ganadas)>(arreglo1[1].ganadas & arreglo1[2].ganadas & arreglo1[3].ganadas & arreglo1[0].ganadas & arreglo1[5].ganadas & arreglo1[6].ganadas)){
                                             
                                            System.out.println(arreglo1[4].nombre);
                                        }
                                    if((arreglo1[5].ganadas)>(arreglo1[1].ganadas & arreglo1[2].ganadas & arreglo1[3].ganadas & arreglo1[4].ganadas & arreglo1[0].ganadas & arreglo1[6].ganadas)){
                                             
                                            System.out.println(arreglo1[5].nombre);
                                        }
                                 
                                    System.out.println("===Pokemones con más derrotas===");
                                    if((arreglo1[0].perdidas)>(arreglo1[1].perdidas & arreglo1[2].perdidas & arreglo1[3].perdidas & arreglo1[4].perdidas & arreglo1[5].perdidas & arreglo1[6].perdidas)){
                                             System.out.println(arreglo1[0].nombre);
                                        }    
                                    if((arreglo1[1].perdidas)>(arreglo1[0].perdidas & arreglo1[2].perdidas & arreglo1[3].perdidas & arreglo1[4].perdidas & arreglo1[5].perdidas & arreglo1[6].perdidas)){
                                             System.out.println(arreglo1[1].nombre);
                                        }
                                    if((arreglo1[2].perdidas)>(arreglo1[1].perdidas & arreglo1[0].perdidas & arreglo1[3].perdidas & arreglo1[4].perdidas & arreglo1[5].perdidas & arreglo1[6].perdidas)){
                                             System.out.println(arreglo1[2].nombre);
                                        }
                                    if((arreglo1[3].perdidas)>(arreglo1[1].perdidas & arreglo1[2].perdidas & arreglo1[0].perdidas & arreglo1[4].perdidas & arreglo1[5].perdidas & arreglo1[6].perdidas)){
                                             System.out.println(arreglo1[3].nombre);
                                        }
                                    if((arreglo1[4].perdidas)>(arreglo1[1].perdidas & arreglo1[2].perdidas & arreglo1[3].perdidas & arreglo1[0].perdidas & arreglo1[5].perdidas & arreglo1[6].perdidas)){
                                             System.out.println(arreglo1[4].nombre);
                                        }
                                    if((arreglo1[5].perdidas)>(arreglo1[1].perdidas & arreglo1[2].perdidas & arreglo1[3].perdidas & arreglo1[4].perdidas & arreglo1[0].perdidas & arreglo1[6].perdidas)){
                                             System.out.println(arreglo1[5].nombre);
                                        }
                                    if((arreglo1[6].perdidas)>(arreglo1[1].perdidas & arreglo1[2].perdidas & arreglo1[3].perdidas & arreglo1[4].perdidas & arreglo1[5].perdidas & arreglo1[0].perdidas)){
                                             System.out.println(arreglo1[6].nombre);
                                        }
                                
                                         
                                        break;
                         
                         }
                             }while(menu2==6);                         
                         
                         }
                        break;
                    case 2:
                        System.out.println("Bienvenidos al club de la pelea");
                        System.out.println("Jugador uno ingrese nombre: ");
                        nombre_usuario1 = sn.next();
                        System.out.println("Jugador uno ingrese nombre: ");
                        nombre_usuario2=sn.next();
                        System.out.println("Combatientes");
                        for (int i=0;i <= arreglo1.length - 1;i++){
                                System.out.println(i+1+". "+"pokemon: "+arreglo1[i].nombre + " vida:" +arreglo1[i].vida + " araque: "+arreglo1[i].ataque);
          
                                
                                }
                        System.out.println(nombre_usuario1+" elija numero de primer pokemon ");
                        personaje1 = sn.nextInt();
                        System.out.println(nombre_usuario1+" elija numero de segundo pokemon ");
                        personaje2 = sn.nextInt();
                        System.out.println(nombre_usuario2+" elija numero de primer pokemon ");
                        personaje3 = sn.nextInt();
                        System.out.println(nombre_usuario2+" elija numero de segundo pokemon ");
                        personaje4 = sn.nextInt();
                        
                         System.out.println(nombre_usuario1);
                         System.out.println("Pokemon 1: "+arreglo1[personaje1-1].nombre+"   Ataque: "+arreglo1[personaje1-1].ataque+"   vida: "+arreglo1[personaje1-1].vida+"   Estado:"+arreglo1[personaje1-1].estado);
                         System.out.println("Pokemon 2: "+arreglo1[personaje2-1].nombre+"   Ataque: "+arreglo1[personaje2-1].ataque+"   vida: "+arreglo1[personaje2-1].vida+"   Estado:"+arreglo1[personaje2-1].estado); 
                         
                         
                         System.out.println(nombre_usuario2);
                         
                         System.out.println("Pokemon 1: "+arreglo1[personaje3-1].nombre+"   Ataque: "+arreglo1[personaje3-1].ataque+"   vida: "+arreglo1[personaje3-1].vida+"   Estado:"+arreglo1[personaje3-1].estado);
                         System.out.println("Pokemon 2: "+arreglo1[personaje4-1].nombre+"   Ataque: "+arreglo1[personaje4-1].ataque+"   vida: "+arreglo1[personaje4-1].vida+"   Estado:"+arreglo1[personaje4-1].estado); 
                        
                        do{
                          
                            
                        System.out.println(nombre_usuario1+" elija el pokemon que desea utilizar");
                        eleccion1 = sn.nextInt();
                        System.out.println(nombre_usuario1+" elija el numero del pokemon que desea atacar");
                        ataque1 = sn.nextInt();
                        if(ataque1==1 && eleccion1==1){
                                 arreglo1[personaje3-1].danoVida(arreglo1[personaje1-1].ataque);
                        }
                        if(ataque1==2 && eleccion1==1){
                                 arreglo1[personaje4-1].danoVida(arreglo1[personaje1-1].ataque);
                        }
                        if(ataque1==1 && eleccion1==2){
                                 arreglo1[personaje3-1].danoVida(arreglo1[personaje2-1].ataque);
                        }
                        if(ataque1==2 && eleccion1==2){
                                 arreglo1[personaje4-1].danoVida(arreglo1[personaje2-1].ataque);
                        }
                        
                        if  (arreglo1[personaje3-1].vida<0){
                             arreglo1[personaje3-1].vida=0;
                             arreglo1[personaje3-1].estado="muerto";
                         }
                          if (arreglo1[personaje4-1].vida<0){
                             arreglo1[personaje4-1].vida=0;
                             arreglo1[personaje4-1].estado="muerto";
                         }
                        
                         System.out.println(nombre_usuario1);
                         System.out.println("Pokemon 1: "+arreglo1[personaje1-1].nombre+"   Ataque: "+arreglo1[personaje1-1].ataque+"   vida: "+arreglo1[personaje1-1].vida+"   Estado:"+arreglo1[personaje1-1].estado);
                         System.out.println("Pokemon 2: "+arreglo1[personaje2-1].nombre+"   Ataque: "+arreglo1[personaje2-1].ataque+"   vida: "+arreglo1[personaje2-1].vida+"   Estado:"+arreglo1[personaje2-1].estado); 
                         
                         
                         System.out.println(nombre_usuario2);
                         System.out.println("Pokemon 1: "+arreglo1[personaje3-1].nombre+"   Ataque: "+arreglo1[personaje3-1].ataque+"   vida: "+arreglo1[personaje3-1].vida+"   Estado:"+arreglo1[personaje3-1].estado);
                         System.out.println("Pokemon 2: "+arreglo1[personaje4-1].nombre+"   Ataque: "+arreglo1[personaje4-1].ataque+"   vida: "+arreglo1[personaje4-1].vida+"   Estado:"+arreglo1[personaje4-1].estado); 
                       
                         
                         
                         
                        System.out.println(nombre_usuario2+" elija el pokemon que desea utilizar");
                        eleccion2 = sn.nextInt(); 
                         
                        System.out.println(nombre_usuario2+" elija el numero del pokemon que desea atacar");
                        ataque2=sn.nextInt();
                        
                        
                        
                        if(ataque2==1 && eleccion2==1){
                                 arreglo1[personaje1-1].danoVida(arreglo1[personaje3-1].ataque);
                        }
                        if(ataque2==2 && eleccion2==1){
                                 arreglo1[personaje2-1].danoVida(arreglo1[personaje3-1].ataque);
                        }
                        if(ataque2==1 && eleccion2==2){
                                 arreglo1[personaje1-1].danoVida(arreglo1[personaje4-1].ataque);
                        }
                        if(ataque2==2 && eleccion2==2){
                                 arreglo1[personaje2-1].danoVida(arreglo1[personaje4-1].ataque);
                        }
                        
                        if (arreglo1[personaje1-1].vida<0){
                             arreglo1[personaje1-1].vida=0;
                             arreglo1[personaje1-1].estado="muerto";
                         }
                       
                          if (arreglo1[personaje2-1].vida<0){
                             arreglo1[personaje2-1].vida=0;
                             arreglo1[personaje2-1].estado="muerto";
                         }
                          
                         System.out.println(nombre_usuario1);
                         System.out.println("Pokemon 1: "+arreglo1[personaje1-1].nombre+"   Ataque: "+arreglo1[personaje1-1].ataque+"   vida: "+arreglo1[personaje1-1].vida+"   Estado:"+arreglo1[personaje1-1].estado);
                         System.out.println("Pokemon 2: "+arreglo1[personaje2-1].nombre+"   Ataque: "+arreglo1[personaje2-1].ataque+"   vida: "+arreglo1[personaje2-1].vida+"   Estado:"+arreglo1[personaje2-1].estado); 
                         
                         
                         System.out.println(nombre_usuario2);
                         System.out.println("Pokemon 1: "+arreglo1[personaje3-1].nombre+"   Ataque: "+arreglo1[personaje3-1].ataque+"   vida: "+arreglo1[personaje3-1].vida+"   Estado:"+arreglo1[personaje3-1].estado);
                         System.out.println("Pokemon 2: "+arreglo1[personaje4-1].nombre+"   Ataque: "+arreglo1[personaje4-1].ataque+"   vida: "+arreglo1[personaje4-1].vida+"   Estado:"+arreglo1[personaje4-1].estado); 
                         
                          
                          
                         
                        }while(((arreglo1[personaje1-1].estado.equals("vivo") || arreglo1[personaje2-1].estado.equals("vivo"))) && ((arreglo1[personaje3-1].estado.equals("vio") || arreglo1[personaje4-1].estado.equals("vivo"))));
                       
                        if(arreglo1[personaje1-1].estado=="vivo"){
                        arreglo1[personaje1-1].ganadas=arreglo1[personaje1-1].ganadas+1;
                        }
                        if(arreglo1[personaje2-1].estado=="vivo"){
                        arreglo1[personaje2-1].ganadas=arreglo1[personaje2-1].ganadas+1;
                        }
                         
                         
                          if(arreglo1[personaje3-1].estado=="vivo"){
                        arreglo1[personaje3-1].ganadas=arreglo1[personaje3-1].ganadas+1;
                        }
                        if(arreglo1[personaje4-1].estado=="vivo"){
                        arreglo1[personaje4-1].ganadas=arreglo1[personaje4-1].ganadas+1;
                        }
                        
                         
                         if(arreglo1[personaje1-1].estado=="muerto"){
                        arreglo1[personaje1-1].perdidas=arreglo1[personaje1-1].perdidas+1;
                        }
                         
                         if(arreglo1[personaje2-1].estado=="muerto"){
                        arreglo1[personaje2-1].perdidas=arreglo1[personaje2-1].perdidas+1;
                        }
                         
                         if(arreglo1[personaje3-1].estado=="muerto"){
                        arreglo1[personaje3-1].perdidas=arreglo1[personaje3-1].perdidas+1;
                        }
                         
                         if(arreglo1[personaje4-1].estado=="muerto"){
                        arreglo1[personaje4-1].perdidas=arreglo1[personaje4-1].perdidas+1;
                        }
                        
                        
                         
                         System.out.println(arreglo1[personaje1-1].ganadas);
                         System.out.println(arreglo1[personaje2-1].ganadas);
                         System.out.println(arreglo1[personaje2-1].perdidas);
                         System.out.println(arreglo1[personaje3-1].perdidas);
                         System.out.println(arreglo1[personaje4-1].perdidas);
                        
                        arreglo1[personaje1-1].vida=vida_nueva1;
                        arreglo1[personaje2-1].vida=vida_nueva2;
                        arreglo1[personaje3-1].vida=vida_nueva3;
                        arreglo1[personaje4-1].vida=vida_nueva4;
                        
                        
                         
                         
                        System.out.println("Para volver presiones 1");
                         menu=sn.nextInt()+1;
                         
                        
                         
                        break;
                    case 3:
                        salir = true;
                        break;
                    
                   
                }
           }while(menu==2);
          
            }
        }
 
    
 

    
    

