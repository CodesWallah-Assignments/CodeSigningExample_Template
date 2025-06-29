package com.codeswallah.security.friend;

import com.codeswallah.security.doer.Doer;
import java.security.AccessController;
import java.security.PrivilegedAction;

public class Friend implements Doer {
  private Doer next;
  private boolean direct;

  public Friend(Doer next, boolean direct) {
    this.next = next;
    this.direct = direct;
  }
  
  public void doYourThing() {
    if (direct) {
 	next.doYourThing();
    } else {
	AccessController.doPrivileged(
		new PrivilegedAction() {
			public Object run() {
				next.doYourThing();
				return null;
			}
		}
	);
    }
  }
}
