Code from the book __Programming for the Java (tm) Virtual Machine__

To use Oolong (A JVM Assembler)

```
> jad Oolong -help
```

```
Oolong - a Java assembler
Usage:
   Oolong [-g] [-n] [-d directory] [-verbose] file1.j ...
   -g Generate debugging info
   -n Generate debugging info using auto-generated line numbers
   -d Place output files in directory
   -verbose Verbose messages
```

Eg.

```
> jad Oolong -d ./target/j -n -verbose file1.j
```

To use Gnoloo (A Java class file disassembler)

```
> jad Gnoloo -help
```

```
Gnoloo - a Java class file disassembler
Usage:
    Gnoloo [-d directory] [-] file1.class ...
    -d write files in directory
    -  write output to System.out
```

Building
========

```
> mvn package
```

Installing
==========
```
> sudo cp target/jad /usr/local/bin/jad
```

Original Readme
===============

Programming for the Java (tm) Virtual Machine
Support files
Copyright (c) 1999 by Joshua Engel
Software dated 1 April 1999 (but not a joke!)


There are five packages in this distribution:
* COM.sootNsmoke.jvm - a library for building Java (tm)  class files

* COM.sootNsmoke.oolong - A compiler and decompiler for Oolong, a
  language for building JVM class files.

* COM.sootNsmoke.instructions - Support classes for the jvm package.
  Abstractions of JVM instructions to make building code easier.

* COM.sootNsmoke.scheme - a nearly complete implementation of the R4
  Scheme specification, which compiles Scheme code into JVM bytecodes.

* COM.sootNsmoke.prolog - a simple Prolog compiler demonstrating how
  to compile Prolog into JVM code

The main directory contains some top-level-package files to make it
easier to run the Oolong assembler, Gnoloo disassembler, and DumpClass
class file dumper at the command line.  Each of these contains a main
which runs the main from the COM.sootNsmoke.oolong package equivalent.

The jar file jvm.jar contains the compiled oolong, jvm, and instructions
packages in a convenient distributable form.

The directory "doc" contains javadoc docmentation.

The directory "tests" contains some tests of the scheme and prolog packages.

All directories include both Java (tm) code and compiled files.  All Java
code is designed to compile under any Java compiler from 1.0 to 1.2
(Java (tm) 2 platform).

This software is available under the GNU Library Public License.  See
the file Copying.txt for more information.

If you have any questions, comments, or bug reports, ask Joshua Engel
at engel@erols.com or engel@knowledgebus.com.  Or read the newsgroup
comp.lang.java.machine.