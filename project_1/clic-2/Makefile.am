AUTOMAKE_OPTIONS= dejagnu

bin_PROGRAMS = clic
clic_SOURCES = main.c parser.c list.c
AM_CPPFLAGS =
LDADD =
CLEANFILES = *~
DISTCLEANFILES = .deps/*.P
EXTRA_DIST= test

RUNTESTDEFAULTFLAGS = --tool clic CLIC=`pwd`/clic --srcdir $$srcdir/test
