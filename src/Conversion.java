import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char reponse = 'O';
		while(reponse == 'O'){			
			//Initialisation choix conversion 
			int conv = 0;
			//Tant qu'aucun des choix 1 et 2 a été choisi
			while(conv != 1 && conv != 2){
				//Affichage du choix de conversion
				System.out.println("Choisissez le mode de conversion :" );
				System.out.println("1 - Celsius -> Fahrenheit");
				System.out.println("2 - Fahrenheit -> Celsius");
				//Récupére le choix de conversion 
				conv = sc.nextInt();
			}
			//Demande une temperature
			System.out.println("Entrez une température à convertir :");
			//Récupére la temperature
			int temp = sc.nextInt();
			int result = 0;
			String answer = new String();
			//Convertis la température
			if(conv == 1){
				result = 9/5*temp+32;
				answer = ""+temp+"°C font "+result+"°F";
			}else{
				result = (temp-32)*5/9;
				answer = ""+temp+"°F font "+result+"°C";
			}
			//Renvoi le résultat de la conversion
			System.out.println(answer);
			//Proposition pour recommencer
			reponse = ' ';
			while(reponse != 'O' && reponse != 'N'){
				System.out.println("Convertir une autre température ? (O/N)");
				sc.nextLine();
				reponse = sc.nextLine().charAt(0);
			}
		}
		//Fin de la boucle
		System.out.println("Au revoir !");

	}

}
