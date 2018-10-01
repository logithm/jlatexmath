package org.scilab.forge.jlatexmath.commands;

import org.scilab.forge.jlatexmath.Atom;
import org.scilab.forge.jlatexmath.PhantomAtom;
import org.scilab.forge.jlatexmath.TeXParser;

public class CommandVPhantom extends Command1A {

	@Override
	public Atom newI(TeXParser tp, Atom a) {
		return new PhantomAtom(a, false, true, true);
	}

	@Override
	public Command duplicate() {
		return new CommandVPhantom();
	}

}
