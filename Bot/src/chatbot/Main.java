package chatbot;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class Main extends JFrame{
	private JTextField inputBar = new JTextField();
	private JTextArea chatOutput = new JTextArea();
	
	public Main() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,600);
		this.setVisible(true);
		this.setResizable(false);
		this.setTitle("Developer chatbot");
		inputBar.setLocation(2,540);
		inputBar.setSize(590,30);
		
		  inputBar.addActionListener(new ActionListener(){
	            public void actionPerformed(ActionEvent arg0) {
	                String userInput = inputBar.getText();
	                chatOutput.append("You: " + userInput + "\n");
	                
	                if(userInput.contains("Hello")) {
	                	botOutput("fáilte in this astounding chat bot");
	                }
	                else if(userInput.contains("Hi")) {
	                	botOutput("fáilte in this astounding chat bot");
	                }
	                else if(userInput.contains("Inform me about latest developments in IT field")) {
	                	botOutput("There are numerous and alluring developments in IT field one of them is cryptocurrency");
	                }
	                else if(userInput.contains("Inform me about latest coding languages")){
	                	botOutput("There are numerous coding languages in fad: \n 1.Python \n 2.Java  \n 3.Kotlin \n 4.PHP \n 5.Erlang");
	                }
	                else if(userInput.contains("What is string manipulation")){
	                	botOutput("String manipulation basically refers to the process of handling and analyzing strings");
	                }
	                else if(userInput.contains("What is DevOps")){
	                	botOutput("DevOps is a set of practices that combines software development and IT operations.");
	                }
	                else if(userInput.contains("What are algorithms")){
	                	botOutput("Algoriths are bit by bit instructions which create a program");
	                }
	                else if(userInput.contains("What are flowcharts")){
	                	botOutput("A flowchart is a type of diagram that represents an algorithm.");
	                }
	                else if(userInput.contains("What are pseudo codes")){
	                	botOutput("In computer science, pseudocode is a plain language description of the steps in an algorithm or another system.");
	                }
	                else if(userInput.contains("list some astounding developer portals")){
	                	botOutput("Here are some alluring developer portals: \n 1.W3schools \n 2.Tutorials Point \n 3.Javatpoint \n 4.Geeks for Geeks \n 5.MDN");
	                }
	                else if(userInput.contains("What is fibonacci series")){
	                	botOutput("a series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers.");
	                }
	                else if(userInput.contains("What are Pascal numbers")){
	                	botOutput("In mathematics, Pascal's triangle is a triangular array of the binomial coefficients that arises in probability theory, combinatorics, and algebra.");
	                }
	                else if(userInput.contains("What are basic fundamentals of coding")){
	                	botOutput("The basic funfamentals of coding are: \n 1.Arithmetic.\n 2.Data storage. Data storage are items which can save or store data e.g. numbers or strings. \n 3.Data in and Data out.");
	                }
	                else if(userInput.contains("Which programming languages have you worked with?")){
	                	botOutput("I work with multitudinous programming  languages thin on the ground are Java , Python");
	                }
	                else if(userInput.contains("In this year which programming languages should I learn")){
	                	botOutput("There are multitudinous languages to learn. In this day and age Python is in fad  for automation whereas Java for general purpose.");
	                }
	                else if(userInput.contains("Which is the most preferable IDE")){
	                	botOutput("For bog-standard languages you can use Adobe dreamweaver for quantum leap languages you can\n use Eclipse. ");
	                }
	                else {
	                	botOutput("Invalid option");
	                }
	                inputBar.setText("");
	            }
	        });
	        
	      //chatOutput
	        chatOutput.setLocation(15, 5);
	        chatOutput.setSize(560, 510);
	        chatOutput.setLineWrap(true);
	        chatOutput.setEditable(false);
	        
	        //Frame items
	        this.add(inputBar);
	        this.add(chatOutput);
	    }
	    
	    public void botOutput(String s){
	        chatOutput.append("ChatBot: " + s + "\n");
	    }
	    
	    public static void main(String[] args){
	        new Main();
	    }
	  
	}
