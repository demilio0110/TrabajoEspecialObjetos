import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import fichas.comparadores.comparador;
import fichas.comparadores.comparadorinverso;
import fichas.filtros.*;
import fichas.personaje.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ITEM 1
		
		Ficha Flash = new Ficha("Flash");
		Flash.addAt("Altura", (float)1.78);
		Flash.addAt("Peso", (float)90);
		Flash.addAt("Fuerza", (float)900);
		Flash.addAt("PGanadas", (float)10);
		Flash.addAt("Velocidad", (float)800000);
		Flash.addAt("Inteligencia", (float)50);
		
		Ficha CapitanFrio = new Ficha("Capitan Frio");
		CapitanFrio.addAt("Altura", (float) 1.88);
		CapitanFrio.addAt("Peso", (float)95);
		CapitanFrio.addAt("Fuerza", (float)600);
		CapitanFrio.addAt("PGanadas", (float)20);
		CapitanFrio.addAt("Velocidad", (float)48);
		CapitanFrio.addAt("Maldad", (float)50);
		
		Ficha Superman = new Ficha("Superman");
		Superman.addAt("Altura", (float) 1.92);
		Superman.addAt("Peso", (float)107);
		Superman.addAt("Fuerza", (float)2600);
		Superman.addAt("PGanadas", (float)200);
		Superman.addAt("Velocidad", (float)1200);
				
		Ficha Batman = new Ficha("Batman");
		Batman.addAt("Altura", (float) 1.89);
		Batman.addAt("Peso", (float)96);
		Batman.addAt("Fuerza", (float)950);
		Batman.addAt("PGanadas", (float)15);
		Batman.addAt("Velocidad", (float)120);
		Batman.addAt("Inteligencia", (float)150);
		
		Ficha Robin = new Ficha("Robin");
		Robin.addAt("Altura", (float)1.75);		
		Robin.addAt("Peso", (float)65);
		Robin.addAt("Fuerza", (float)710);
		Robin.addAt("PGanadas", (float)8);
		Robin.addAt("Velocidad", (float)60);
		Robin.addAt("Inteligencia", (float)100);
		
		Ficha Guason = new Ficha("Guason");
		Guason.addAt("Altura", (float) 1.85);
		Guason.addAt("Peso", (float)72);
		Guason.addAt("Fuerza", (float)300);
		Guason.addAt("PGanadas", (float)3);
		Guason.addAt("Velocidad", (float)60);
		Guason.addAt("Inteligencia", (float)150);
		Guason.addAt("Maldad", (float)100);
		
		Ficha LexLuthor = new Ficha("Lex Luthor");
		LexLuthor.addAt("Altura", (float) 1.88);
		LexLuthor.addAt("Peso", (float)95);
		LexLuthor.addAt("Fuerza", (float)1000);
		LexLuthor.addAt("PGanadas", (float)1);
		LexLuthor.addAt("Velocidad", (float)70);
		LexLuthor.addAt("Maldad", (float)75);
		
		Ficha Gatubela = new Ficha("Gatubela");
		Gatubela.addAt("Altura", (float) 1.69);
		Gatubela.addAt("Peso", (float)51);
		Gatubela.addAt("Fuerza", (float)720);
		Gatubela.addAt("PGanadas", (float)5);
		Gatubela.addAt("Velocidad", (float)90);
		Gatubela.addAt("Inteligencia", (float)150);
		Gatubela.addAt("Maldad", (float)25);
		
		// COLECCION DE TODAS LAS FICHAS INDIVIDUALES
		
		Grupo Coleccion = new Grupo("Coleccion");
		Coleccion.addFicha(Flash);
		Coleccion.addFicha(CapitanFrio);
		Coleccion.addFicha(Superman);
		Coleccion.addFicha(Batman);
		Coleccion.addFicha(Robin);
		Coleccion.addFicha(Guason);
		Coleccion.addFicha(LexLuthor);
		Coleccion.addFicha(Gatubela);
		
		
		// ITEM 2
		
		Grupo DuoDinamico = new Grupo("Duo Dinamico");
		DuoDinamico.addFicha(Batman);
		DuoDinamico.addFicha(Robin);
		
		Grupo LigadelaJusticia = new Grupo("Liga de la Justicia");
		LigadelaJusticia.addFicha(Flash);
		LigadelaJusticia.addFicha(Superman);
		LigadelaJusticia.addFicha(DuoDinamico);
		
		Grupo LigadelaInjusticia = new Grupo("Liga de la Injusticia");
		LigadelaInjusticia.addFicha(CapitanFrio);
		LigadelaInjusticia.addFicha(Guason);
		LigadelaInjusticia.addFicha(LexLuthor);
		LigadelaInjusticia.addFicha(Gatubela);
		
		//AGREGO LOS GRUPOS A UNA COLECCION DE FICHAS EN COMUN. 
		
		Coleccion.addFicha(DuoDinamico);
		Coleccion.addFicha(LigadelaJusticia);
		Coleccion.addFicha(LigadelaInjusticia);		
		
		
		List<String> atributos = new ArrayList<>();
		atributos.add("Fuerza");
		atributos.add("PGanadas");
		atributos.add("Inteligencia");
		atributos.add("Maldad");
		
		System.out.println("Item 3"+"\n");
		
		System.out.println(DuoDinamico.getNombre());
		System.out.println(DuoDinamico.getInfoGrupo(atributos));
		
		System.out.println(LigadelaJusticia.getNombre());
		System.out.println(LigadelaJusticia.getInfoGrupo(atributos));
		
		System.out.println(LigadelaInjusticia.getNombre());
		System.out.println(LigadelaInjusticia.getInfoGrupo(atributos));
		
		//ITEM 4	
		// DEFINICION DE FILTROS PARA REALIZAR LA BUSQUEDA DE FICHAS/GRUPOS
		Filtro v100 = new FMayor("Velocidad", (float)100);
		
		Filtro f900 = new FMenor("Fuerza", (float)900);
		
		Filtro m50a = new FIgual("Maldad", (float)50);
		Filtro m50b = new FMayor("Maldad", (float)50);
		Filtro m50ab = new FOr(m50a, m50b);
		Filtro i80 = new FMayor("Inteligencia", (float)80);
		Filtro m50andi80 = new FAnd(i80, m50ab);
		
		Filtro p70 = new FMayor("Peso", (float)70);
		
		// DEFINICION DE COMPARADORES PARA ORDENAR Y REALIZAR LA BUSQUEDA DE FICHAS/GRUPOS
		comparador velocidadAsc = new comparador("Velocidad");
		comparadorinverso velocidadDesc = new comparadorinverso();
		velocidadDesc.setComparador(velocidadAsc);
		
		comparador fuerzaAsc = new comparador("Fuerza");
		
		comparador pesoAsc = new comparador("Peso");
		comparadorinverso pesoDesc = new comparadorinverso();
		pesoDesc.setComparador(pesoAsc);
		
		System.out.println("4-Mostrar listado de personajes...");
		System.out.println("a "+Coleccion.listar(v100, velocidadDesc));
		System.out.println("b "+Coleccion.listar(f900, fuerzaAsc));
		System.out.println("c "+Coleccion.listar(m50andi80));
		System.out.println("d "+Coleccion.listar(p70, pesoDesc));
		
		
		//FICHAS DE AUTOS ITEM 5
		Ficha ChevroletCruze = new Ficha("Chevrolet Cruze");
		ChevroletCruze.addAt("Velocidad", (float)220);
		ChevroletCruze.addAt("HP", (float)153);
		ChevroletCruze.addAt("Cilindros", (float)4);
		ChevroletCruze.addAt("RPM", (float)5000);
		ChevroletCruze.addAt("Aceleracion", (float)8.5);
		ChevroletCruze.addAt("Cm3", (float)1400);
		ChevroletCruze.addAt("Precio", (float)12000);
		
		Ficha ChevroletS10 = new Ficha("Chevrolet S10");
		ChevroletS10.addAt("Velocidad", (float)200);
		ChevroletS10.addAt("HP", (float)200);
		ChevroletS10.addAt("Cilindros", (float)4);
		ChevroletS10.addAt("RPM", (float)3600);
		ChevroletS10.addAt("Aceleracion", (float)7.5);
		ChevroletS10.addAt("Cm3", (float)2800);
		ChevroletS10.addAt("Precio", (float)31000);
		
		Ficha ChevroletCamaro = new Ficha("Chevrolet Camaro");
		ChevroletCamaro.addAt("Velocidad", (float)380);
		ChevroletCamaro.addAt("HP", (float)405);
		ChevroletCamaro.addAt("Cilindros", (float)8);
		ChevroletCamaro.addAt("RPM", (float)5900);
		ChevroletCamaro.addAt("Aceleracion", (float)3);
		ChevroletCamaro.addAt("Cm3", (float)6100);
		ChevroletCamaro.addAt("Precio", (float)0);
		
		Ficha FordKa = new Ficha("Ford Ka");
		FordKa.addAt("Velocidad", (float)180);
		FordKa.addAt("HP", (float)105);
		FordKa.addAt("Cilindros", (float)4);
		FordKa.addAt("RPM", (float)6000);
		FordKa.addAt("Aceleracion", (float)10);
		FordKa.addAt("Cm3", (float)1500);
		FordKa.addAt("Precio", (float)12500);
		
		Ficha FordRanger = new Ficha("Ford Ranger");
		FordRanger.addAt("Velocidad", (float)210);
		FordRanger.addAt("HP", (float)166);
		FordRanger.addAt("Cilindros", (float)4);
		FordRanger.addAt("RPM", (float)5500);
		FordRanger.addAt("Aceleracion", (float)8);
		FordRanger.addAt("Cm3", (float)2500);
		FordRanger.addAt("Precio", (float)28000);
		
		Ficha FordMustang = new Ficha("Ford Mustang");
		FordMustang.addAt("Velocidad", (float)450);
		FordMustang.addAt("HP", (float)503);
		FordMustang.addAt("Cilindros", (float)8);
		FordMustang.addAt("RPM", (float)7000);
		FordMustang.addAt("Aceleracion", (float)4);
		FordMustang.addAt("Cm3", (float)0);
		FordMustang.addAt("Precio", (float)95000);
		
		Ficha HondaFit = new Ficha("Honda Fit");
		HondaFit.addAt("Velocidad", (float)230);
		HondaFit.addAt("HP", (float)132);
		HondaFit.addAt("Cilindros", (float)4);
		HondaFit.addAt("RPM", (float)6600);
		HondaFit.addAt("Aceleracion", (float)7.5);
		HondaFit.addAt("Cm3", (float)1500);
		HondaFit.addAt("Precio", (float)24000);
		
		Ficha HondaAccord = new Ficha("Honda Accord");
		HondaAccord.addAt("Velocidad", (float)320);
		HondaAccord.addAt("HP", (float)280);
		HondaAccord.addAt("Cilindros", (float)6);
		HondaAccord.addAt("RPM", (float)6600);
		HondaAccord.addAt("Aceleracion", (float)5);
		HondaAccord.addAt("Cm3", (float)3500);
		HondaAccord.addAt("Precio", (float)0);
		
		//ITEM 6
		Grupo Japoneses = new Grupo("Japoneses");
		Japoneses.addFicha(HondaFit);
		Japoneses.addFicha(HondaAccord);
		
		Grupo Sedan = new Grupo("Sedan");
		Sedan.addFicha(ChevroletCruze);
		Sedan.addFicha(FordKa);
		Sedan.addFicha(Japoneses);
		
		Grupo Carrera = new Grupo("Carrera");
		Carrera.addFicha(ChevroletCamaro);
		Carrera.addFicha(FordMustang);
		
		Grupo Camionetas = new Grupo("Camionetas");
		Camionetas.addFicha(ChevroletS10);
		Camionetas.addFicha(FordRanger);
		
		Grupo Potencia = new Grupo("Potencia");
		Potencia.addFicha(Camionetas);
		Potencia.addFicha(Carrera);
		
		// AGREGO AUTOS Y GRUPOS A UNA COLECCION DE AUTOS QUE LOS CONTENGA A TODOS.
		Grupo coleccionAutos = new Grupo("coleccionAutos");
		coleccionAutos.addFicha(ChevroletCruze);
		coleccionAutos.addFicha(ChevroletS10);
		coleccionAutos.addFicha(ChevroletCamaro);
		coleccionAutos.addFicha(FordKa);
		coleccionAutos.addFicha(FordRanger);
		coleccionAutos.addFicha(FordMustang);
		coleccionAutos.addFicha(HondaFit);
		coleccionAutos.addFicha(HondaAccord);
		coleccionAutos.addFicha(Japoneses);
		coleccionAutos.addFicha(Sedan);
		coleccionAutos.addFicha(Carrera);
		coleccionAutos.addFicha(Camionetas);
		coleccionAutos.addFicha(Potencia);
		
		// ITEM 6
		
		List<String> atributoAutos = new ArrayList<>();
		atributoAutos.add("Velocidad");
		atributoAutos.add("Aceleracion");
		atributoAutos.add("Precio");
		
		System.out.println("");
		System.out.println("ITEM 6");
		System.out.println(Japoneses);
		System.out.println(Japoneses.getInfoGrupo(atributoAutos));
		
		System.out.println(Sedan);
		System.out.println(Sedan.getInfoGrupo(atributoAutos));
		
		System.out.println(Carrera);
		System.out.println(Carrera.getInfoGrupo(atributoAutos));
		
		System.out.println(Camionetas);
		System.out.println(Camionetas.getInfoGrupo(atributoAutos));
		
		System.out.println(Potencia);
		System.out.println(Potencia.getInfoGrupo(atributoAutos));
		
		// ITEM 7
		// DEFINICION DE FILTROS PARA REALIZAR LA BUSQUEDA DE FICHAS/GRUPOS
		
		Filtro v200 = new FMayor("Velocidad", (float)200);
		
		Filtro cm2000 = new FMenor("Cm3", (float)2000);
		
		Filtro hp150 = new FMayor("HP", (float)150);
		Filtro p15000 = new FMayor("Precio", (float)15000);
		Filtro hp150andp15000 = new FAnd(hp150, p15000);
				
		// DEFINICION DE COMPARADORES PARA ORDENAR Y REALIZAR LA BUSQUEDA DE FICHAS/GRUPOS
		comparador velocidadAscAutos = new comparador("Velocidad");
				
		comparador cilindradaAscAutos = new comparador("Cilindrada");
		
		System.out.println("7-Mostrar listado de Ficha/Grupo...");
		System.out.println("e "+coleccionAutos.listar(v200, velocidadAscAutos));
		System.out.println("f "+coleccionAutos.listar(cm2000, cilindradaAscAutos));
		System.out.println("g "+coleccionAutos.listar(hp150andp15000));
				
	}

}
