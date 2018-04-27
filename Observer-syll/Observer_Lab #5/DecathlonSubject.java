package pkgObserverLab5;

import pkgObserverClubMtg.Observer;

public interface DecathlonSubject {
	public void attach(DecathlonObserver ob);
	public void notifyObservers();
}