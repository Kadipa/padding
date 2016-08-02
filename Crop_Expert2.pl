% ----- Months --------------------------------------------------------------------------------------

month(january).
month(february).
month(march).
month(april).
month(june).
month(july).
month(august).
month(september).
month(october).
month(november).
month(december).




% ----- In Month X, Y occurs ----------------------------------------------------------------------

in(january,rice_blust).				% <1: Disease rice_blust>
in(february,rice_blust).
in(december,rice_blust).
in(july,rice_blust).
in(august,rice_blust).
in(september,rice_blust).

in(november,bacterial_leaf_blight).		% <2: Disease bacterial_leaf_blight>
in(december,bacterial_leaf_blight).
in(june,bacterial_leaf_blight).
in(july,bacterial_leaf_blight).
in(august,bacterial_leaf_blight).
in(september,bacterial_leaf_blight).

in(january,rice_root_knot_nematode).		% <3: Disease rice_root_knot_nematode>
in(february,rice_root_knot_nematode).
in(december,rice_root_knot_nematode).

in(january,white_tip_nematode).			% <4: Disease white_tip_nematode>
in(february,white_tip_nematode).
in(march,white_tip_nematode).
in(april,white_tip_nematode).
in(december,white_tip_nematode).
in(june,white_tip_nematode).
in(july,white_tip_nematode).
in(august,white_tip_nematode).
in(september,white_tip_nematode).
in(october,white_tip_nematode).



% ----- If in Month X, Y occurs then Y is Disease ----------------------------------------------------

is_disease(rice_blust) :- in(january,rice_blust).					% <1: Disease rice_blust>					
is_disease(rice_blust) :- in(february,rice_blust).
is_disease(rice_blust) :- in(december,rice_blust).
is_disease(rice_blust) :- in(july,rice_blust).
is_disease(rice_blust) :- in(august,rice_blust).
is_disease(rice_blust) :- in(september,rice_blust).


is_disease(bacterial_leaf_blight) :- in(november,bacterial_leaf_blight).		% <2: Disease bacterial_leaf_blight>
is_disease(bacterial_leaf_blight) :- in(december,bacterial_leaf_blight).
is_disease(bacterial_leaf_blight) :- in(june,bacterial_leaf_blight).
is_disease(bacterial_leaf_blight) :- in(july,bacterial_leaf_blight).
is_disease(bacterial_leaf_blight) :- in(august,bacterial_leaf_blight).
is_disease(bacterial_leaf_blight) :- in(september,bacterial_leaf_blight).

is_disease(rice_root_knot_nematode) :- in(january,rice_root_knot_nematode).		% <3: Disease rice_root_knot_nematode>
is_disease(rice_root_knot_nematode) :- in(february,rice_root_knot_nematode).
is_disease(rice_root_knot_nematode) :- in(december,rice_root_knot_nematode).

is_disease(white_tip_nematode) :- in(january,white_tip_nematode).			% <4: Disease white_tip_nematode>
is_disease(white_tip_nematode) :- in(february,white_tip_nematode).
is_disease(white_tip_nematode) :- in(march,white_tip_nematode).
is_disease(white_tip_nematode) :- in(april,white_tip_nematode).
is_disease(white_tip_nematode) :- in(december,white_tip_nematode).
is_disease(white_tip_nematode) :- in(june,white_tip_nematode).
is_disease(white_tip_nematode) :- in(july,white_tip_nematode).
is_disease(white_tip_nematode) :- in(august,white_tip_nematode).
is_disease(white_tip_nematode) :- in(september,white_tip_nematode).
is_disease(white_tip_nematode) :- in(october,white_tip_nematode).



% ----- Unify disease(X) and is_disease(X) ------------------------------------------------------------ 

disease(rice_blust) :- is_disease(rice_blust).						% <1: Disease rice_blust>
disease(bacterial_leaf_blight) :- is_disease(bacterial_leaf_blight).			% <2: Disease bacterial_leaf_blight>
disease(rice_root_knot_nematode) :- is_disease(rice_root_knot_nematode).		% <3: Disease rice_root_knot_nematode>
disease(white_tip_nematode) :- is_disease(white_tip_nematode).				% <4: Disease white_tip_nematode>


% ------- Solution -----------------------------------------------
solution(rice_blust,soln1).
solution(bacterial_leaf_blight,soln2).
solution(rice_root_knot_nematode,soln3).
solution(white_tip_nematode,soln4).