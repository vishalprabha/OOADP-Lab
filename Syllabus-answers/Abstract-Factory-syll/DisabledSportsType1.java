package pkgAbstractFactory;

//This is the Sports Abstract Factory for Disabled 
/* DisabledSportsType1 has three methods to implement from 'SportsTypeAbstractFactory' 
 * They are: 
 * --- createAdventureSports
 * --- createOutdoorRegularSports
 * --- createIndoorRegularSports
 * 'DisabledSportsType1' always creates  
 * --- BungeeJumpingDisabled for AdventureSports
 * --- SquashDisabled for IndoorRegularSports
 * --- BlindCricket for OutdoorRegularSports
 */

public class DisabledSportsType1 implements SportsTypeAbstractFactory{
	
	public OutdoorAdventureSports createAdventureSports() { 
		return new BungeeJumpingDisabled(); 
		}
	public OutdoorRegularSports createOutdoorRegularSports(){
		return new WheelChairCricket(); 
		}
	/*public IndoorRegularSports createIndoorRegularSports(){
		return new SquashDisabled(); 
		}*/

	
	

}
