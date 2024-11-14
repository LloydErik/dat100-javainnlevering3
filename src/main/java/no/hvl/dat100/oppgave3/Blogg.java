package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

import java.util.Arrays;

public class Blogg {
	Innlegg[] innleggstabell;
	int nesteledig;

	public Blogg() {
		this.innleggstabell = new Innlegg[20];
		this.nesteledig = 0;
	}

	public Blogg(int lengde) {
		this.innleggstabell = new Innlegg[lengde];
		this.nesteledig = 0;

	}

	public int getAntall() {
		return this.nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return this.innleggstabell;
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for(int i = 0 ; i < nesteledig ; i++){
			if(innleggstabell[i].getId() == innlegg.getId()){
				return i;
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		for(int i = 0 ; i < nesteledig ; i++){
			if(innleggstabell[i].getId() == innlegg.getId()){
				return true;
			}
		}
		return false;
	}

	public boolean ledigPlass() {
		return nesteledig < innleggstabell.length;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		if(ledigPlass()){
			innleggstabell[nesteledig] = innlegg;
			nesteledig++;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(nesteledig).append("\n");

		for (int i = 0; i < nesteledig; i++) {
			result.append(innleggstabell[i].toString());
		}

		return result.toString();	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}