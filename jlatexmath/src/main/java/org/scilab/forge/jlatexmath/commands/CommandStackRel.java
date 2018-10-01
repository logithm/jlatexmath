package org.scilab.forge.jlatexmath.commands;

import org.scilab.forge.jlatexmath.Atom;
import org.scilab.forge.jlatexmath.TeXConstants;
import org.scilab.forge.jlatexmath.TeXLength;
import org.scilab.forge.jlatexmath.TeXParser;
import org.scilab.forge.jlatexmath.UnderOverAtom;

public class CommandStackRel extends Command1O2A {

	@Override
	public Atom newI(TeXParser tp, Atom a, Atom b, Atom c) {
		final Atom at = new UnderOverAtom(c, a, new TeXLength(TeXLength.Unit.MU, 3.5), true, b,
				new TeXLength(TeXLength.Unit.MU, 3.), true);
		return at.changeType(TeXConstants.TYPE_RELATION);
	}

	@Override
	public Command duplicate() {
		CommandStackRel ret = new CommandStackRel();
		ret.hasopt = hasopt;
		ret.option = option;
		ret.atom = atom;
		return ret;
	}

}
