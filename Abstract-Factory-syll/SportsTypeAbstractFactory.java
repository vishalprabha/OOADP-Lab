package pkgAbstractFactory;

//This is the Sports Abstract Factory for Disabled and Abled Sports Enthusiasts 
/* There are three methods which it expects its classes that implement it to fill the implementation logic  
* They are: 
* --- createAdventureSports. Returns an object of OutdoorAdventureSports. It could be Bungee-Jumping, Para-Gliding etc 
* --- createOutdoorRegularSports.It could be Football, Cricket etc 
* --- createIndoorRegularSports.It could be Table-Tennis, Squash  etc 
*/

public interface SportsTypeAbstractFactory {
	
	OutdoorAdventureSports createAdventureSports(); 
	OutdoorRegularSports createOutdoorRegularSports(); 
	//IndoorRegularSports createIndoorRegularSports(); 

}
