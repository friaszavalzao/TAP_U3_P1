/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tap_u3_p1;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Frases extends Canvas{
    NewJFrame puntero;
    private int i=0;
    String NumeroFase="";
    Timer Contador;
    String [] arreglo={
    "El único deber que tenemos con la historia es reescribirla. (Oscar Wilde)",
    "Hay que tratar con cuidado las historias viejas; se parecen a rosas marchitas que se deshojan al menor contacto. (Selma Lagerlöf)",
    "La historia es el progreso de la conciencia de la libertad. (Georg W. F. Hegel)",
    "La historia es la destilación del rumor. (Thomas Carlyle)",
    " No hay caminos para la paz; la paz es el camino (Mahatma Gandhi)",
    " Haz el amor y no la guerra (John Lennon)",
    " Lo peor que hacen los malos es obligarnos a dudar de los buenos (Jacinto Benavente)",
    " Aprende a vivir y sabrás morir bien (Confucio)",
    "No hay nada que un hombre no sea capaz de hacer cuando una mujer le mira (Casanova)",
    "El dinero no puede comprar la vida (Bob Marley)",
    "Si es bueno vivir, todavía es mejor soñar, y lo mejor de todo, despertar (Antonio Machado)",
    "La mayor declaración de amor es la que no se hace; el hombre que siente mucho, habla poco (Platón)",
    "Si das pescado a un hombre hambriento lo nutres durante una jornada. Si le enseñas a pescar, le nutrirás toda su vida (Lao Tsé)",
    "Vale más actuar exponiéndose a arrepentirse de ello, que arrepentirse de no haber hecho nada (Giovanni Boccaccio)",
    " Ningún hombre es lo bastante bueno para gobernar a otros sin su consentimiento. (Abraham Lincoln)",
    "Vivir sola es como estar en una fiesta donde nadie te hace caso (Marilyn Monroe)",
    " El cuerpo humano es el carruaje; el yo, el hombre que lo conduce; el pensamiento son las riendas, y los sentimientos, los caballos (Platón)",
    " Estar preparado es importante, saber esperarlo es aún más, pero aprovechar el momento adecuado es la clave de la vida (Arthur Schnitzler)",
    "No estoy tan enamorado de mis propias opiniones que ignore lo que los demás puedan pensar acerca de ellas (Copérnico)",
    "La más estricta justicia no creo que sea siempre la mejor política (Abraham Lincoln)",
    " El sabio no dice nunca todo lo que piensa, pero siempre piensa todo lo que dice (Aristóteles)",
    "Hay dos cosas que son infinitas: el universo y la estupidez humana; de la primera no estoy muy seguro (Albert Einstein)",
    " El mundo es bello, pero tiene un defecto llamado hombre (Friedrich Nietzsche)",
    "La pereza viaja tan despacio que la pobreza no tarda en alcanzarla (Benjamin Franklin)",
    "Una velada en que todos los presentes estén absolutamente de acuerdo es una velada perdida (Albert Einstein)",
    "Pienso, luego existo (René Descartes)",
    "No abras los labios si no estás seguro de que lo que vas a decir es más hermoso que el silencio (Proverbio árabe)",
    "De todos los animales de la creación el hombre es el único que bebe sin tener sed, come sin tener hambre y habla sin tener nada que decir (John Steinbeck)",
    " Un hermano puede no ser un amigo, pero un amigo será siempre un hermano. (Benjamin Franklin)",
    " Sólo puede ser feliz siempre el que sepa ser feliz con todo (Confucio)",
    "Ninguna persona merece tus lágrimas, y quien se las merezca no te hará llorar (Gabriel García Márquez)",
    "De humanos es errar y de necios permanecer en el error (Marco Tulio Cicerón)",
    " Algunas personas son tan falsas que ya no distinguen que lo que piensan es justamente lo contrario de lo que dicen (Marcel Aymé)",
    " La peor experiencia es la mejor maestra (Kovo",
    "La Educación es el pasaporte hacia el futuro, el mañana pertenece a aquellos que se preparan para él en el día de hoy (Malcolm X)",
    "Los amigos se convierten con frecuencia en ladrones de nuestro tiempo (Platón)",
    "No permitas que ningún ser humano te haga caer tan bajo como para odiarle (Martin Luther King)",
    " El pesimista se queja del viento; el optimista espera que cambie; el realista ajusta las velas (William George Ward)",
    " Un amigo de todos es una amigo de nadie (Aristóteles)",
    "Hace falta toda una vida para aprender a vivir (Séneca)"
    };

    public Frases() {
        Contador = new Timer(20000,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(i<arreglo.length){
                repaint();i++;
             
            }else {Contador.stop();
               JOptionPane.showMessageDialog(null,"SE HAN TERMINADO LAS FRASES");}
        }
    });
    }
    
    
    @Override
      public void paint(Graphics g) {
           super.paint(g); //To change body of generated methods, choose Tools | Templates.
           Graphics2D g2 =(Graphics2D)g;
            Frase frase=new Frase();
            frase.pintar(g2,arreglo);
          //g2.fillOval(5, 5  , 30, 30);
    }
      
       
}
