package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Lesson> list = new ArrayList<>();
		
		System.out.print("Quantas aulas tem o curso? ");
		int N = sc.nextInt();
		
		System.out.println();
		
		for (int i = 1; i <= N; i++) {
			System.out.printf("Dados da %da aula: \n", i);
			System.out.print("Conteudo ou tarefa (c/t)? ");
			char type = sc.next().charAt(0);
			System.out.print("Titulo: ");
			sc.nextLine();
			String title = sc.nextLine();
		
			if (type == 'c') {
				System.out.print("URL do video: ");
				String url = sc.nextLine();
				System.out.print("Duracao em segundos: ");
				int seconds = sc.nextInt();
				list.add(new Video(title, url, seconds));
				System.out.println();

			}
			else {
				System.out.print("Descricao: ");
				String description = sc.nextLine();
				System.out.print("Quantidade de questoes: ");
				int questionCount = sc.nextInt();
				
				list.add(new Task(title, description, questionCount));
				System.out.println();
				
				System.out.print("DURACAO TOTAL DO CURSO = ");
				
				int sum = 0;
				for(Lesson les : list) {
					sum += les.duration();
				}
				System.out.print(sum + " " + "segundos");
				
				
			
				
			
			}
		}
		
		
		sc.close();

	}

}
