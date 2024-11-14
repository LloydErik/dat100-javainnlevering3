package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import no.hvl.dat100.oppgave3.Blogg;
import no.hvl.dat100.oppgave1.Innlegg;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		String filePath = mappe + "/" + filnavn;
		try(PrintWriter writer = new PrintWriter(filePath)){
			writer.println(samling.getAntall());

			for (Innlegg innlegg : samling.getSamling()){
				if(innlegg != null){
					writer.print(innlegg.toString());
				}
			}
			return true;
		}
		catch (FileNotFoundException e){
			System.out.println("error eln");
			return false;
		}
	}
}
