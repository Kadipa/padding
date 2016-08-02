
month(january).
month(february).
month(march).
month(april).
month(may).
month(june).
month(july).
month(august).
month(september).
month(october).
month(november).
month(december).


in(rice_stemborer,january).
in(rice_stemborer,february).
in(rice_stemborer,march).
in(rice_stemborer,april).
in(rice_stemborer,may).
in(rice_stemborer,june).
in(rice_stemborer,july).
in(rice_stemborer,august).
in(rice_stemborer,september).
in(rice_stemborer,october).
in(rice_stemborer,november).
in(rice_stemborer,december).

in(rice_ear_bug,march).
in(rice_ear_bug,april).
in(rice_ear_bug,september).
in(rice_ear_bug,october).

in(rice_ear_cutting_caterpillar,march).
in(rice_ear_cutting_caterpillar,april).
in(rice_ear_cutting_caterpillar,september).
in(rice_ear_cutting_caterpillar,october).
in(rice_ear_cutting_caterpillar,november).
in(rice_ear_cutting_caterpillar,december).

in(rice_gallmidge,june).
in(rice_gallmidge,july).
in(rice_gallmidge,august).
in(rice_gallmidge,september).

insect(rice_stemborer) :- in(rice_stemborer,january),
in(rice_stemborer,february),
in(rice_stemborer,march),
in(rice_stemborer,april),
in(rice_stemborer,may),
in(rice_stemborer,june),
in(rice_stemborer,july),
in(rice_stemborer,august),
in(rice_stemborer,september),
in(rice_stemborer,october),
in(rice_stemborer,november),
in(rice_stemborer,december).

insect(rice_ear_bug) :- in(rice_ear_bug,march),
in(rice_ear_bug,april),
in(rice_ear_bug,september),
in(rice_ear_bug,october).

insect(rice_ear_cutting_caterpillar) :- in(rice_ear_cutting_caterpillar,march),
in(rice_ear_cutting_caterpillar,april),
in(rice_ear_cutting_caterpillar,september),
in(rice_ear_cutting_caterpillar,october),
in(rice_ear_cutting_caterpillar,november),
in(rice_ear_cutting_caterpillar,december).

insect(rice_gallmidge) :- in(rice_gallmidge,june),
in(rice_gallmidge,july),
in(rice_gallmidge,august),
in(rice_gallmidge,september).




