package util;

public enum Emoji {

	SORRISO(0x1F603),
	SORRISO_DENTE(0x1F601),
	SORRISO_OLHO_FECHADO(0x1F604),
	SORRISO_GOTA_SUOR(0x1F605),
	PISCADA(0x1F609),
	SORRISO_COVINHA(0x1F60A),
	LINGUA_PARA_FORA(0x1F60B),
	OLHO_CORACAO(0x1F60D),
	SORRISO_LADO(0x1F60F),
	EMBURRADO_LADO(0x1F612),
	NOJO(0x1F616),
	BEIJO_CORACAO(0x1F618),
	PISCADA_LINGUA(0x1F61C),
	TRISTE(0x1F61E),
	BRAVO(0x1F620),
	CHORANDO(0x1F62D),
	SURPRESO(0x1F631),
	ESPANTADO(0x1F632),
	MAOS_ALTO(0x1F64C),
	CARA_CORACOES(0x1F970),
	PENSANDO(0x1F914),
	DORMINDO(0x1F634),
	APATICO(0x1F611),
	CERTO(0x2705),
	X(0x2716),
	SEM_SOM(0x1F507),
	SOM(0x1F509),
	ATENCAO(0x26A0),
	CADEIRANTE(0x267F),
	MAO(0x270B),
	DEDO_APONTANDO(0x27A1),
	DOIS_DEDOS(0x270C),
	PUNHO(0x1F44A),
	ACENO(0x1F44B),
	OK(0x1F44C),
	POSITIVO(0x1F44D),
	NEGATIVO(0x1F44E),
	PALMAS(0x1F44F),
	DUAS_MAOS(0x1F450),
	CORACAO(0x2764);
	
	private int numero;
	
	Emoji(int i) {
            this.numero = i;
        }
	
        public int getNumero(){
            return numero;
        }
        
	public String getEmoji() {
            String emoji = new String(Character.toChars(getNumero())); 
            return emoji;
	}
}
