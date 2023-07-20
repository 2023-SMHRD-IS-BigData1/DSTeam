package main;

import javazoom.jl.player.MP3Player;

public class Stage {
	protected int lv = 1;
	protected int w = 1;
	protected int h = 1;

	Sleep time = new Sleep();

	int getw() {
		return w;
	}

	int geth() {
		return h;
	}

	void setLv() {
	}

	void setLv(int lv) {
		this.lv = lv;
	}

	void setFieldSize(int w, int h) {
		this.w = w;
		this.h = h;
	}

	void printStartScreen1() {

		System.out.println("\n\n\n");
		System.out.println("\t         ██╗     ██╗ █████╗ ███╗   ██╗ ██████╗      ██████╗ ██╗   ██╗        ");
		System.out.println("\t         ██║     ██║██╔══██╗████╗  ██║██╔════╝     ██╔════╝ ██║   ██║        ");
		System.out.println("\t         ██║     ██║███████║██╔██╗ ██║██║  ███╗    ██║  ███╗██║   ██║        ");
		System.out.println("\t    ██   ██║██   ██║██╔══██║██║╚██╗██║██║   ██║    ██║   ██║██║   ██║        ");
		System.out.println("\t    ╚█████╔╝╚█████╔╝██║  ██║██║ ╚████║╚██████╔╝    ╚██████╔╝╚██████╔╝        ");
		System.out.println("\t     ╚════╝  ╚════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝ ╚═════╝      ╚═════╝  ╚═════╝         ");
		System.out.println("                                                                               ");
		System.out.println("\t █████╗ ██████╗ ██╗   ██╗███████╗███╗   ██╗████████╗██╗   ██╗██████╗ ███████╗");
		System.out.println("\t██╔══██╗██╔══██╗██║   ██║██╔════╝████╗  ██║╚══██╔══╝██║   ██║██╔══██╗██╔════╝");
		System.out.println("\t███████║██║  ██║██║   ██║█████╗  ██╔██╗ ██║   ██║   ██║   ██║██████╔╝█████╗  ");
		System.out.println("\t██╔══██║██║  ██║╚██╗ ██╔╝██╔══╝  ██║╚██╗██║   ██║   ██║   ██║██╔══██╗██╔══╝  ");
		System.out.println("\t██║  ██║██████╔╝ ╚████╔╝ ███████╗██║ ╚████║   ██║   ╚██████╔╝██║  ██║███████╗");
		System.out.println("\t╚═╝  ╚═╝╚═════╝   ╚═══╝  ╚══════╝╚═╝  ╚═══╝   ╚═╝    ╚═════╝ ╚═╝  ╚═╝╚══════╝");
		System.out.println("\n\n\n");
	}

	void printStartScreen2() {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("	 ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣠⣤⣤⣤⣤⣤⣤⣄⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("	 ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("	 ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⣿⣿⣿⣿⣭⡉⠉⠉⠉⠉⠉⠉⣉⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("	  ⠀⠀⠀⠀⠀⠀⢀⣼⣿⣿⣿⡿⣿⣿⣿⣿⣆⠀⠀⠀⢀⣾⣿⣿⣿⣿⠿⠛⠻⣿⣿⣿⣿⣿⣿⣷⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("	⠀⠀  ⠀⠀⠀⢀⣾⣿⣿⣿⠋⠀⠀⠻⣿⣿⣿⠀⠀⠀⠈⢿⣿⡿⢟⣁⣠⣤⣄⣈⠻⣿⣿⣿⠏⠛⢿⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("	⠀⠀  ⠀⠀⠀⣾⠙⠿⢟⣥⠶⠞⠛⠶⢮⡛⠁⠀⠀⠀⠀⠀⣠⠾⠋⠉⠀⠀⠈⠉⠙⢦⡉⠁⠀⠀⠈⣿⣿⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("	⠀⠀⠀  ⠀⢀⡏⠀⣰⠏⠀⠀⠀⠀⠀⠀⠹⣆⠀⠀⠀⠀⡼⠃⠀⣀⣀⣀⠀⠀⠀⠀⠀⠙⣄⠀⠀ ⠀⢹⣿⣿⣷⡀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("	⠀⠀⠀  ⠀⢸⡇⢠⡏⠀⢀⣴⣾⣿⣿⣶⣦⡛⠀⠀⠀⠐⣡⣾⣿⣿⣿⣿⣿⣶⡄⠀⠀⠀⠸⠄⠀⠀⠈⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("	  ⠀⠀⠀⣠⠼⠃⠀⠀⣰⣿⣿⡿⠛⠛⢿⣿⣿⡄⠀⠀⣰⣿⣿⠟⠋⠉⠻⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣧⣀⡀⠀⠀⠀⠀");
		System.out.println("	   ⠀⣠⠞⠁⠀⠀⠀⣿⣿⣿⡁⠀⠀⣸⣿⣿⡇⠀⠀⣿⣿⣿⠀⠀⠀⢀⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⢸⣿⠟⠁⠀⠀⠉⠢⡀⠀⠀");
		System.out.println("	 ⢸⣿    ⠀⠀⠀⢿⣿⣿⣿⣶⣾⣿⣿⣿⠁⠀⠀⢻⣿⣿⣷⣶⣾⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⡼⠁⠀⠀⠀⠀⠀⠀⠙⣆⠀");
		System.out.println("	 ⣿⣿      ⠀⠀⠙⠻⠿⠿⠿⠿⠛⠁⠀⠀⠀⠀⠙⠻⠿⣿⣿⡿⠿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠘⡄");
		System.out.println("	 ⣿⣿      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢳");
		System.out.println("	 ⣿⣿      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸");
		System.out.println("	   ⣿⣿      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⡤⠀⠀⠀⠀⠀ ⣠⠏");
		System.out.println("	     ⣿⣿    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⡤⠴⠒⠛⠋⠁⠀⠙⠒⠒⠚⠁⠀");
		System.out.println("	        ⣿⣧⣀⠀⠀⠀⠀ ⢀⡀⠀⠀⠀⠀⠀   ⢀⣀⣠⡤⠴⠒⠚⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("	           ⠛⠛⠛⠲⠦⠤⠤⠭⠤⠤⠤⠴⠖⠒⠛⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("\n\n\n\n\n\n\n\n\n");
	}

	void printStartScreen3() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("	         	    ⢀⣤⣾⣿⣿⣷⣄         ╭─────────────────────────╮");
		System.out.println("			 ⣠⣾⣿⣿⣿⣿⣿⣿⣿⣷⣄              짱구야~    ");
		System.out.println("		      ⢀⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀        여기 3만원 줄 테니까          ");
		System.out.println("		  ⣠⣴⣶⣶⣴⣿⣿⣿⣿⣿⣿⡿⢿⣿⣿⣿⣿⣿⣷⣆⣀       피망, 소고기, 바나나 좀 사오렴  ");
		System.out.println("		⢰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠋⠘⣿⣿⣿⠿⣿⣿⣿⣿⣿     ╰─────────────────────────╯          ");
		System.out.println("           ⠀⣀⣸⣿⣿⣿⣿⣿⣿⣿⡿⢹⠟⠁⠀⠀⠀⠹⣿⣿⠀⠈⢻⣿⣿⣿⣧⣶⣶⣤⡀			   ");
		System.out.println("         ⣠⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⢃⡺⠤⠤⡀ ⠀⠀⠀⢿⡏⠀⠀⠀⠻⣿⣿⣿⣿⣿⣿⣿⣷			    ");
		System.out.println("       ⢀⣾⣿⣿⣿⣿⣿⣿⡿⠛⠛⢿⠱⠋⠀⠀⠀⠈⠆ ⠀⠀ ⣃ ⡠⠥⣀⠀⠙⢿⣿⣿⣿⣿⣤⣤⣄⡀           ");
		System.out.println("       ⣼⣿⣿⣿⣿⣿⣿⠏⠀⠀⠀⠀⠀⠀⠀⣰⣾⣿⣶⡀⠀⠀⠀⠀⠀⠀⠀⠈⠆⠀⣹⣿⣿⣿⣿⣿⣿⣿⣿⣆          ");
		System.out.println("       ⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⣤⡿⠃⠀⢀⣾⠿⣷⡄⠀⠀⢠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡆         ");
		System.out.println("       ⢻⣿⣿⣿⣿⣿⣿⣦⣀⣀⣀⠀ ⠀⠈⠓⠈⠉⠀⠀⠀⠈⠻⠶⠿⠃⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿			");
		System.out.println("  	⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⠀⠀⠀⠀⠀⠀⠀⠀⢠⡀⠀⠀⠀⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇			");
		System.out.println("  	  ⠈⠛⠛⠿⠿⠛⠻⣿⣿⣿⣷⡀⠀⠀⠀⠀⠀⠀⠘⠃⠀⠀⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃		    ");
		System.out.println("	          ⠻⢿⣿⠿⠀⠀⢣⡀⠀⣾⣷⣦⣄⡀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟			");
		System.out.println("	                 ⠑⣄⠻⣿⣿⡿⠃⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁			");
		System.out.println("	              ⡭⠍ ⠀⠈⢣⡀⠙⠋⣡⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠛⠋            ");
		System.out.println("	              ⠑⠦⡀⠉⠁⠀                              ");
		System.out.println("\n\n\n\n\n\n\n\n");

	}

	void printStartScreen4() {
		System.out.println("\n\n\n\n");
		System.out.println("⠀⠀⠀⠀⠀	 ⠀ ⠀⠀⠀⠀⠀   ⠀⠀ ⠀⠀⠀⠀⣀⣀⣠⣤⣤⣤⣤⣤⣤⣄⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀	⠀  ⠀⠀  ⠀⠀⠀⠀⠀⠀⣀⣤⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀  ⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀	⠀  ⠀ ⠀ ⠀⠀⠀⣠⣴⣿⣿⣿⣿⣭⡉⠉⠉⠉⠉⠉⠉⣉⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣄⠀⠀⠀⠀ ⠀   ╭─────────╮   ⠀⠀⠀⠀");
		System.out.println("⠀⠀⠀	 ⠀  ⠀ ⠀⠀⢀⣼⣿⣿⣿⡿⣿⣿⣿⣿⣆⠀⠀⠀⢀⣾⣿⣿⣿⣿⠿⠛⠻⣿⣿⣿⣿⣿⣿⣷⣦⡀⠀⠀ ⠀    호호이 ~~⠀⠀⠀               ⠀⠀");
		System.out.println("⠀⠀⠀	   ⠀⠀ ⠀⢀⣾⣿⣿⣿⠋⠀⠀⠻⣿⣿⣿⠀⠀⠀⠈⢿⣿⡿⢟⣁⣠⣤⣄⣈⠻⣿⣿⣿⠏⠛⢿⣿⣄⠀    ╰─────────╯ ⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀	   ⠀⠀ ⠀⣾⠙⠿⢟⣥⠶⠞⠛⠶⢮⡛⠁⠀⠀⠀⠀⠀⣠⠾⠋⠉⠀⠀⠈⠉⠙⢦⡉⠁⠀⠀⠈⣿⣿⣧⡀    ⠀⠀  ⠀⠀⠀");
		System.out.println("⠀⠀	  ⠀ ⠀⠀⢀⡏⠀⣰⠏⠀⠀⠀⠀⠀⠀⠹⣆⠀⠀⠀⠀⡼⠃⠀⣀⣀⣀⠀⠀⠀⠀⠀⠙⣄⠀⠀⠀ ⢹⣿⣿⣷⡀⠀⠀⠀⠀⠀⠀     ⠀");
		System.out.println("⠀⠀ 	 ⠀  ⠀⠀⢸⡇⢠⡏⠀⢀⣴⣾⣿⣿⣶⣦⡛⠀⠀⠀⠐⣡⣾⣿⣿⣿⣿⣿⣶⡄⠀⠀⠀⠸⠄⠀⠀⠈⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("⠀⠀ 	 ⠀  ⠀⣠⠼⠃⠀⠀⣰⣿⣿⡿⠛⠛⢿⣿⣿⡄⠀⠀⣰⣿⣿⠟⠋⠉⠻⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣧⣀⡀⠀⠀⠀⠀");
		System.out.println(" 	    ⣠⠞⠁⠀⠀⠀⣿⣿⣿⡁⠀⠀⣸⣿⣿⡇⠀⠀⣿⣿⣿⠀⠀⠀⢀⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⢸⣿⠟⠁⠀⠀⠉⠢⡀⠀⠀");
		System.out.println("	 ⢸⣿    ⠀⠀⠀⢿⣿⣿⣿⣶⣾⣿⣿⣿⠁⠀⠀⢻⣿⣿⣷⣶⣾⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⡼⠁⠀⠀⠀⠀⠀⠀⠙⣆⠀");
		System.out.println("	 ⣿⣿      ⠀⠀⠙⠻⠿⠿⠿⠿⠛⠁⠀⠀⠀⠀⠙⠻⠿⣿⣿⡿⠿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠘⡄");
		System.out.println("	 ⣿⣿      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢳");
		System.out.println("	 ⣿⣿      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸");
		System.out.println("	  ⣿⣿      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⡤⠀⠀⠀⠀⠀ ⣠⠏");
		System.out.println(" 	   ⣿⣿    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⡤⠴⠒⠛⠋⠁⠀⠙⠒⠒⠚⠁⠀");
		System.out.println(" 	      ⣿⣧⣀⠀⠀⠀⠀ ⢀⡀⠀⠀⠀⠀⠀   ⢀⣀⣠⡤⠴⠒⠚⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println(" 	         ⠛⠛⠛⠲⠦⠤⠤⠭⠤⠤⠤⠴⠖⠒⠛⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("\n\n\n\n\n\n\n\n\n");

		System.out.println("\n\n\n\n\n\n\n\n\n\n");
		System.out.println("\t\t\t" + " ============= 게임 설명 ! ============= ");
		System.out.println("\t\t\t" + "        Ü : 짱구의 현재 위치 입니다!! ");
		System.out.println("\t\t\t" + "          ♥ : 상점의 위치 입니다!! ");
		System.out.println("\t\t\t" + "     w a s d 를 이용하여 상점에 도착하세요 ");
		System.out.println("\t\t\t" + "      한번에 총 3번까지 이동이 가능합니다 ");
		System.out.println("\t\t\t" + " ==================================== ");
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		time.sleep(3000);

	}

	void printLv() {
		System.out.println("\t\t\t" + " Ü : 짱구의 현재 위치!");
		System.out.println("\t\t\t" + " ♥ : 상점의 위치(도착해야할 위치)! ");
		System.out.println("\t\t\t" + " ▒ : 벽의 위치 입니다! ");
		System.out.println();
		System.out.println("\t\t\t" + " 짱구네 떡잎마을 ");
		
	}

	void stage1Clear() {
		System.out.println();
		System.out.println("\t\t\t" + "=================================");
		System.out.println("\t\t\t" + "         아줌마 피망 주세요!");
		System.out.println();
		time.sleep(1700);
		System.out.println("\t\t\t" + "         피망은 2000원이야~");
		System.out.println("\t\t\t" + "=================================");
		time.sleep(1700);
		System.out.println("\t\t\t" + "        2000원이 차감되었습니다.");
		System.out.println("\t\t\t\t" + "    피망 획득!!!");
	}

	void stage2Clear() {
		System.out.println();
		System.out.println("\t\t\t" + "=================================");
		System.out.println("\t\t\t" + "        아줌마 소고기 주세요!");
		System.out.println();
		time.sleep(1700);
		System.out.println("\t\t\t" + "        소고기는 15000원이야~");
		System.out.println("\t\t\t" + "=================================");
		time.sleep(1700);
		System.out.println("\t\t\t" + "       15000원이 차감되었습니다.");
		System.out.println("\t\t\t\t" + "   소고기 획득!!!");
	}

	void stage3Clear() {
		System.out.println();
		System.out.println("\t\t\t" + "=================================");
		System.out.println("\t\t\t" + "        아줌마 바나나 주세요!");
		System.out.println();
		time.sleep(1700);
		System.out.println("\t\t\t" + "        바나나는 4000원이야~");
		System.out.println("\t\t\t" + "=================================");
		time.sleep(1700);
		System.out.println("\t\t\t" + "        4000원이 차감되었습니다.");
		System.out.println("\t\t\t\t" + "   바나나 획득!!!");
	}

	void printEndingScreen1() {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("	⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣠⣤⣤⣤⣤⣤⣤⣄⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("	⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀ ╭─────────────────────────╮ ⠀⠀⠀⠀");
		System.out.println("	⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⣿⣿⣿⣿⣭⡉⠉⠉⠉⠉⠉⠉⣉⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣄⠀⠀⠀⠀⠀⠀          오욧!! ⠀⠀⠀⠀");
		System.out.println("	⠀⠀⠀⠀⠀⠀⠀⢀⣼⣿⣿⣿⡿⣿⣿⣿⣿⣆⠀⠀⠀⢀⣾⣿⣿⣿⣿⠿⠛⠻⣿⣿⣿⣿⣿⣿⣷⣦⡀⠀⠀   피망, 소고기, 바나나 사기 성공!!⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("	⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⠋⠀⠀⠻⣿⣿⣿⠀⠀⠀⠈⢿⣿⡿⢟⣁⣠⣤⣄⣈⠻⣿⣿⣿⠏⠛⢿⣿⣄⠀⠀⠀⠀⠀⠀    집에 가야지~⠀⠀⠀⠀");
		System.out.println("	⠀⠀⠀⠀⠀⠀⣾⠙⠿⢟⣥⠶⠞⠛⠶⢮⡛⠁⠀⠀⠀⠀⠀⣠⠾⠋⠉⠀⠀⠈⠉⠙⢦⡉⠁⠀⠀⠈⣿⣿⣧⡀ ╰─────────────────────────╯⠀⠀⠀⠀");
		System.out.println("	⠀⠀⠀⠀⠀⢀⡏⠀⣰⠏⠀⠀⠀⠀⠀⠀⠹⣆⠀⠀⠀⠀⡼⠃⠀⣀⣀⣀⠀⠀⠀⠀⠀⠙⣄⠀ ⠀⠀⢹⣿⣿⣷⡀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("	⠀⠀⠀⠀⠀⢸⡇⢠⡏⠀⢀⣴⣾⣿⣿⣶⣦⡛⠀⠀⠀⠐⣡⣾⣿⣿⣿⣿⣿⣶⡄⠀⠀⠀⠸⠄⠀⠀⠈⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("	⠀⠀⠀⠀⣠⠼⠃⠀⠀⣰⣿⣿⡿⠛⠛⢿⣿⣿⡄⠀⠀⣰⣿⣿⠟⠋⠉⠻⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣧⣀⡀⠀⠀⠀⠀");
		System.out.println("	  ⠀⣠⠞⠁⠀⠀⠀⣿⣿⣿⡁⠀⠀⣸⣿⣿⡇⠀⠀⣿⣿⣿⠀⠀⠀⢀⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⢸⣿⠟⠁⠀⠀⠉⠢⡀⠀⠀");
		System.out.println("	⢸⣿    ⠀⠀⠀⢿⣿⣿⣿⣶⣾⣿⣿⣿⠁⠀⠀⢻⣿⣿⣷⣶⣾⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⡼⠁⠀⠀⠀⠀⠀⠀⠙⣆⠀");
		System.out.println("	⣿⣿      ⠀⠀⠙⠻⠿⠿⠿⠿⠛⠁⠀⠀⠀⠀⠙⠻⠿⣿⣿⡿⠿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠘⡄");
		System.out.println("	⣿⣿      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢳");
		System.out.println("	⣿⣿      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸");
		System.out.println("	  ⣿⣿      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⡤⠀⠀⠀⠀⠀ ⣠⠏");
		System.out.println("	    ⣿⣿    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⡤⠴⠒⠛⠋⠁⠀⠙⠒⠒⠚⠁⠀");
		System.out.println("	       ⣿⣧⣀⠀⠀⠀⠀ ⢀⡀⠀⠀⠀⠀⠀   ⢀⣀⣠⡤⠴⠒⠚⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("	          ⠛⠛⠛⠲⠦⠤⠤⠭⠤⠤⠤⠴⠖⠒⠛⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("\n\n\n\n\n\n\n\n\n");
	}

	void printEndingScreen2() {
		System.out.println("	⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣠⣤⣤⣤⣤⣤⣤⣄⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("	⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀ ╭─────────────────────────╮ ⠀⠀⠀⠀");
		System.out.println("	⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⣿⣿⣿⣿⣭⡉⠉⠉⠉⠉⠉⠉⣉⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣄⠀⠀⠀⠀⠀⠀            엄마~ ⠀⠀⠀⠀");
		System.out.println("	⠀⠀⠀⠀⠀⠀⠀⢀⣼⣿⣿⣿⡿⣿⣿⣿⣿⣆⠀⠀⠀⢀⣾⣿⣿⣿⣿⠿⠛⠻⣿⣿⣿⣿⣿⣿⣷⣦⡀⠀⠀       재료 다 사왔어요!!⠀⠀⠀⠀⠀⠀");
		System.out.println("	⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⠋⠀⠀⠻⣿⣿⣿⠀⠀⠀⠈⢿⣿⡿⢟⣁⣠⣤⣄⣈⠻⣿⣿⣿⠏⠛⢿⣿⣄⠀⠀⠀⠀⠀⠀     ⠀⠀배고파요~⠀");
		System.out.println("	⠀⠀⠀⠀⠀⠀⣾⠙⠿⢟⣥⠶⠞⠛⠶⢮⡛⠁⠀⠀⠀⠀⠀⣠⠾⠋⠉⠀⠀⠈⠉⠙⢦⡉⠁⠀⠀⠈⣿⣿⣧⡀ ╰─────────────────────────╯⠀⠀⠀⠀");
		System.out.println("	⠀⠀⠀⠀⠀⢀⡏⠀⣰⠏⠀⠀⠀⠀⠀⠀⠹⣆⠀⠀⠀⠀⡼⠃⠀⣀⣀⣀⠀⠀⠀⠀⠀⠙⣄⠀⠀ ⠀⢹⣿⣿⣷⡀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("	⠀⠀⠀⠀⠀⢸⡇⢠⡏⠀⢀⣴⣾⣿⣿⣶⣦⡛⠀⠀⠀⠐⣡⣾⣿⣿⣿⣿⣿⣶⡄⠀⠀⠀⠸⠄⠀⠀⠈⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("	⠀⠀⠀⠀⣠⠼⠃⠀⠀⣰⣿⣿⡿⠛⠛⢿⣿⣿⡄⠀⠀⣰⣿⣿⠟⠋⠉⠻⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣧⣀⡀⠀⠀⠀⠀");
		System.out.println("	  ⠀⣠⠞⠁⠀⠀⠀⣿⣿⣿⡁⠀⠀⣸⣿⣿⡇⠀⠀⣿⣿⣿⠀⠀⠀⢀⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⢸⣿⠟⠁⠀⠀⠉⠢⡀⠀⠀");
		System.out.println("	⢸⣿    ⠀⠀⠀⢿⣿⣿⣿⣶⣾⣿⣿⣿⠁⠀⠀⢻⣿⣿⣷⣶⣾⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⡼⠁⠀⠀⠀⠀⠀⠀⠙⣆⠀");
		System.out.println("	⣿⣿      ⠀⠀⠙⠻⠿⠿⠿⠿⠛⠁⠀⠀⠀⠀⠙⠻⠿⣿⣿⡿⠿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠘⡄");
		System.out.println("	⣿⣿      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢳");
		System.out.println("	⣿⣿      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸");
		System.out.println("	  ⣿⣿      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⡤⠀⠀⠀⠀⠀ ⣠⠏");
		System.out.println("	    ⣿⣿    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⡤⠴⠒⠛⠋⠁⠀⠙⠒⠒⠚⠁⠀");
		System.out.println("	       ⣿⣧⣀⠀⠀⠀⠀ ⢀⡀⠀⠀⠀⠀⠀   ⢀⣀⣠⡤⠴⠒⠚⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("	          ⠛⠛⠛⠲⠦⠤⠤⠭⠤⠤⠤⠴⠖⠒⠛⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("\n\n\n\n\n\n\n\n\n");
	}

	void printEndingScreen3() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("	                     ⢀⣤⣾⣿⣿⣷⣄             ╭────────────────────────╮");
		System.out.println("	                   ⣠⣾⣿⣿⣿⣿⣿⣿⣿⣷⣄                    어머 짱구야~    ");
		System.out.println("	                ⢀⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀                너무 수고했어~~          ");
		System.out.println("	              ⣠⣴⣶⣶⣴⣿⣿⣿⣿⣿⣿⡿⢿⣿⣿⣿⣿⣿⣷⣆⣀          얼른 저녁 만들어서 먹자!  ");
		System.out.println("	             ⢰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠋⠘⣿⣿⣿⠿⣿⣿⣿⣿⣿     ╰────────────────────────╯          ");
		System.out.println("	           ⠀⣀⣸⣿⣿⣿⣿⣿⣿⣿⡿⢹⠟⠁⠀⠀⠀⠹⣿⣿⠀⠈⢻⣿⣿⣿⣧⣶⣶⣤⡀            ");
		System.out.println("	         ⣠⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⢃⡺⠤⠤⡀ ⠀⠀⠀⢿⡏⠀⠀⠀⠻⣿⣿⣿⣿⣿⣿⣿⣷             ");
		System.out.println("	       ⢀⣾⣿⣿⣿⣿⣿⣿⡿⠛⠛⢿⠱⠋⠀⠀⠀⠈⠆ ⠀⠀ ⣃ ⡠⠥⣀⠀⠙⢿⣿⣿⣿⣿⣤⣤⣄⡀           ");
		System.out.println("	       ⣼⣿⣿⣿⣿⣿⣿⠏⠀⠀⠀⠀⠀⠀⠀⣰⣾⣿⣶⡀⠀⠀⠀⠀⠀⠀⠀⠈⠆⠀⣹⣿⣿⣿⣿⣿⣿⣿⣿⣆          ");
		System.out.println("	       ⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⣤⡿⠃⠀⢀⣾⠿⣷⡄⠀⠀⢠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡆         ");
		System.out.println("	      ⢻⣿⣿⣿⣿⣿⣿⣦⣀⣀⣀⠀ ⠀⠈⠓⠈⠉⠀ ⠀⠈⠻⠶⠿⠃⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿         ");
		System.out.println("	       ⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⠀⠀⠀⠀⠀⠀⠀⠀⢠⡀⠀⠀⠀⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇         ");
		System.out.println("	         ⠈⠛⠛⠿⠿⠛⠻⣿⣿⣿⣷⡀⠀⠀⠀⠀⠀⠀⠘⠃⠀⠀⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃          ");
		System.out.println("	                ⠻⢿⣿⠿⠀⠀⢣⡀⠀⣾⣷⣦⣄⡀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟         ");
		System.out.println("	                       ⠑⣄⠻⣿⣿⡿⠃⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁         ");
		System.out.println("	                    ⡭⠍ ⠀⠈⢣⡀⠙⠋⣡⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠛⠋            ");
		System.out.println("	                    ⠑⠦⡀⠉⠁⠀                              ");
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
	}

	void printEndingScreen4() {
		System.out.println("	⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣠⣤⣤⣤⣤⣤⣤⣄⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("	⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀ ╭─────────────────────────╮ ⠀⠀⠀⠀");
		System.out.println("	⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⣿⣿⣿⣿⣭⡉⠉⠉⠉⠉⠉⠉⣉⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣄⠀⠀⠀⠀⠀⠀         피망은 싫은데~ ⠀⠀⠀⠀");
		System.out.println("	⠀⠀⠀⠀⠀⠀⠀⢀⣼⣿⣿⣿⡿⣿⣿⣿⣿⣆⠀⠀⠀⢀⣾⣿⣿⣿⣿⠿⠛⠻⣿⣿⣿⣿⣿⣿⣷⣦⡀⠀⠀     ⠀⠀⠀⠀부리부리부리~~~~");
		System.out.println("	⠀⠀⠀⠀⠀⠀⢀⣾⣿⣿⣿⠋⠀⠀⠻⣿⣿⣿⠀⠀⠀⠈⢿⣿⡿⢟⣁⣠⣤⣄⣈⠻⣿⣿⣿⠏⠛⢿⣿⣄⠀⠀⠀⠀⠀⠀     ⠀⠀⠀");
		System.out.println("	⠀⠀⠀⠀⠀⠀⣾⠙⠿⢟⣥⠶⠞⠛⠶⢮⡛⠁⠀⠀⠀⠀⠀⣠⠾⠋⠉⠀⠀⠈⠉⠙⢦⡉⠁⠀⠀⠈⣿⣿⣧⡀ ╰─────────────────────────╯⠀⠀⠀⠀");
		System.out.println("	⠀⠀⠀⠀⠀⢀⡏⠀⣰⠏⠀⠀⠀⠀⠀⠀⠹⣆⠀⠀⠀⠀⡼⠃⠀⣀⣀⣀⠀⠀⠀⠀⠀⠙⣄⠀⠀ ⠀⢹⣿⣿⣷⡀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("	⠀⠀⠀⠀⠀⢸⡇⢠⡏⠀⢀⣴⣾⣿⣿⣶⣦⡛⠀⠀⠀⠐⣡⣾⣿⣿⣿⣿⣿⣶⡄⠀⠀⠀⠸⠄⠀⠀⠈⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("	⠀⠀⠀⠀⣠⠼⠃⠀⠀⣰⣿⣿⡿⠛⠛⢿⣿⣿⡄⠀⠀⣰⣿⣿⠟⠋⠉⠻⣿⣿⣿⡄⠀⠀⠀⠀⠀⠀⠀⢿⣿⣿⣿⣧⣀⡀⠀⠀⠀⠀");
		System.out.println("	  ⠀⣠⠞⠁⠀⠀⠀⣿⣿⣿⡁⠀⠀⣸⣿⣿⡇⠀⠀⣿⣿⣿⠀⠀⠀⢀⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⢸⣿⠟⠁⠀⠀⠉⠢⡀⠀⠀");
		System.out.println("	⢸⣿    ⠀⠀⠀⢿⣿⣿⣿⣶⣾⣿⣿⣿⠁⠀⠀⢻⣿⣿⣷⣶⣾⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀⡼⠁⠀⠀⠀⠀⠀⠀⠙⣆⠀");
		System.out.println("	⣿⣿      ⠀⠀⠙⠻⠿⠿⠿⠿⠛⠁⠀⠀⠀⠀⠙⠻⠿⣿⣿⡿⠿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠘⡄");
		System.out.println("	⣿⣿      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢳");
		System.out.println("	⣿⣿      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸");
		System.out.println("	  ⣿⣿      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⡤⠀⠀⠀⠀⠀ ⣠⠏");
		System.out.println("	    ⣿⣿    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⡤⠴⠒⠛⠋⠁⠀⠙⠒⠒⠚⠁⠀");
		System.out.println("	       ⣿⣧⣀⠀⠀⠀⠀ ⢀⡀⠀⠀⠀⠀⠀   ⢀⣀⣠⡤⠴⠒⠚⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("	          ⠛⠛⠛⠲⠦⠤⠤⠭⠤⠤⠤⠴⠖⠒⠛⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("\n\n\n\n\n\n\n\n\n");
	}

	void printEndingScreen5() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("	                     ⢀⣤⣾⣿⣿⣷⣄             ╭────────────────────────╮");
		System.out.println("	                   ⣠⣾⣿⣿⣿⣿⣿⣿⣿⣷⣄                      ");
		System.out.println("	                 ⢀⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀               짱구 너!!!!!!!      ");
		System.out.println("	              ⣠⣴⣶⣶⣴⣿⣿⣿⣿⣿⣿⡿⢿⣿⣿⣿⣿⣿⣷⣆⣀           ");
		System.out.println("	             ⢰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠋⠘⣿⣿⣿⠿⣿⣿⣿⣿⣿     ╰────────────────────────╯          ");
		System.out.println("	           ⠀⣀⣸⣿⣿⣿⣿⣿⣿⣿⡿⢹⠟⠁⠀⠀⠀⠹⣿⣿⠀⢻⣿⣿⣿⣧⣶⣶⣤⡀            ");
		System.out.println("	         ⣠⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⢃⡺⠤⡀ ⠀⠀⠀⢿⡏⠀⠀⠀⠻⣿⣿⣿⣿⣿⣿⣿⣷             ");
		System.out.println("	       ⢀⣾⣿⣿⣿⣿⣿⣿⡿⠛⠛⢿⠱⠋⠀⠀⠀⠈⠆⠀⣃⣃ ⡠⠥⠤ ⠙⢿⣿⣿⣿⣿⣤⣤⣄⡀           ");
		System.out.println("	       ⣼⣿⣿⣿⣿⣿⣿⠏⠀⠀⠀⠀⠀⠀⠀⣰⣾⣿⣶⡀⠀⠀⠀⠀⠀⠀  ⠀⣹⣿⣿⣿⣿⣿⣿⣿⣿⣆          ");
		System.out.println("	       ⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⢿⣿⣤⡿⠃⠀⢀⣾⠿⣷⡄⠀⠀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡆         ");
		System.out.println("	      ⢻⣿⣿⣿⣿⣿⣿⣦⣀⣀⣀⠀ ⠀⠈⠓⠈⠉ ⠀⠀⠈⠻⠶⠿⠃⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿         ");
		System.out.println("	       ⠈⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⠀⠀⠀⠀⠀⠀⠀⠀⢠⡀⠀⠀⠀⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇         ");
		System.out.println("	         ⠈⠛⠛⠿⠿⠛⠻⣿⣿⣿⣷⡀⠀⠀⠀⠀⠀⠀⠘⠃⠀⠀⠀⣸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃          ");
		System.out.println("	                ⠻⢿⣿⠿⠀⠀⢣⡀⠀⣾⣷⣦⣄⡀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟         ");
		System.out.println("	                       ⠑⣄⠻⣾⣷⡿⠃⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁         ");
		System.out.println("	                     ⡭⠍ ⠀⠈⢣⡀⠙⠋⣡⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠛⠋            ");
		System.out.println("	                      ⠑⠦⡀⠉⠁⠀                              ");
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");

	}

	void stageFail() {
		MP3Player mp3 = new MP3Player();
		
			mp3.play(".//bgm//fail.mp3");
		
		Sleep time = new Sleep();

		if (mp3.isPlaying()) {
			mp3.stop();
			mp3.play(".//bgm//ending_credit.mp3");
			endingCredit();
		}
	}

	void endingCredit() {
		System.out.println("\t\t\t" + "    ■■┃■■■┃■■■┃■■■┃■■■┃■■■┃■■■■");
		System.out.println("\t\t\t" + "    ┻┻┻┻┻┻┻┻┻┻┻┻┻┻┻┻┻┻┻┻┻┻┻┻┻┻┻");
		System.out.println("\t\t\t" + " ♪~ ♬ ♪♬~♪ ♪~ ♬ ♪♬~♪ ♪~ ♬ ♪♬~♪ ♪~ ♬ ♪");
		System.out.println();
		time.sleep(700);
		System.out.print(" Dae Sub٩(̾●̮̮̃̾•̃̾)۶   ");
		time.sleep(500);
		System.out.print(" Ha Youngฅʕ•̫͡•ʔฅ  ");
		time.sleep(500);
		System.out.print(" Chang Yong٩(̃-̮̮̃-)۶  ");
		time.sleep(500);
		System.out.print(" Jung Ho(ง•̀_•́)ง   ");
		time.sleep(500);
		System.out.println(" Jun Young٩(੭•̀ᴗ•̀)੭");
		time.sleep(700);
		System.out.print("          ❅                ");
		time.sleep(400);
		System.out.print("  *❅     ");
		time.sleep(300);
		System.out.print("                      *                ");
		time.sleep(400);
		System.out.println("      ❅        \r");
		time.sleep(500);

		System.out.print("❅                ");
		time.sleep(400);
		System.out.print("    ❄                ");
		time.sleep(300);
		System.out.print("             *                ");
		time.sleep(400);
		System.out.println("    *              ❅                ");
		time.sleep(500);
		System.out.print("       ❅              ");
		time.sleep(300);
		System.out.println("❅             ❆       \r\n");
		time.sleep(500);

		System.out.print(" *            ❄  \t  \t  *      ");
		time.sleep(300);
		System.out.println("                  ❅        ");
		time.sleep(500);
		System.out.println("  \t\t       *    ");
		time.sleep(400);
		System.out.print("       ❅                ");
		time.sleep(400);
		System.out.println("           ❅ \t\t   ❅        \r");
		time.sleep(500);
		System.out.println("                 *                                                            *❅           ");
		time.sleep(400);
		System.out.print("❅                ");
		time.sleep(500);
		System.out.println("                       ❆                          ❄   \r\n");
		time.sleep(500);
		System.out.print("     *❅                     ❆                                        * ");
		time.sleep(500);
		System.out.println("                            ❆ \r\n");
		time.sleep(500);
		System.out.println("    ❅                \r\n");
		time.sleep(700);
		
		System.out.print("❅                ");
		time.sleep(400);
		System.out.print("    ❄                ");
		time.sleep(300);
		System.out.print("             *                ");
		time.sleep(400);
		System.out.println("    *              ❅                ");
		time.sleep(500);
		System.out.print("       ❅              ");
		time.sleep(300);
		System.out.println("❅             ❆       \r\n");
		time.sleep(500);
		System.out.print(" *            ❄  \t  \t  *      ");
		time.sleep(300);
		System.out.println("                  ❅        ");
		time.sleep(500);
		System.out.println("  \t\t       *    ");
		time.sleep(400);
		System.out.print("       ❅                ");
		time.sleep(400);
		System.out.println("           ❅ \t\t   ❅        \r");
		time.sleep(500);
		System.out.println("                 *                                                            *❅           ");
		time.sleep(400);
		System.out.print("❅                ");
		time.sleep(500);
		System.out.println("                       ❆                          ❄   \r\n");
		time.sleep(500);
		System.out.print("     *❅                     ❆                                        * ");
		time.sleep(500);
		System.out.println("                            ❆ \r\n");
		time.sleep(500);
		System.out.println("    ❅                \r\n");
		time.sleep(700);
		System.out.println();
		System.out.println("                                 플레이 해주셔서 감사합니다 ");
	}
}
