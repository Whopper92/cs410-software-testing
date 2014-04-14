AUTOMAKE_OPTIONS= dejagnu

bin_PROGRAMS = clic
clic_SOURCES = main.c parser.c list.c pstack.c
AM_CPPFLAGS =
clic_LDADD = -lreadline -ldl -lm
CLEANFILES = *~
DISTCLEANFILES = .deps/*.P
EXTRA_DIST= test
AM_CFLAGS= --coverage -L/usr/local/lib -I/usr/local/include

RUNTESTDEFAULTFLAGS = --tool clic CLIC=`pwd`/clic --srcdir $$srcdir/test
