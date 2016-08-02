% ----- Symptoms ----------------------------------------------------------------

symptom(leaf_white_thin_layer).
symptom(dry_leaf_like_burning).
symptom(no_top_level_of_leaf).
symptom(many_circles_of_leaf_white_thin_layer).
symptom(stem_spoil).
symptom(white_grain).
symptom(small_grain).
symptom(no_grain).
symptom(puffy_scion).
symptom(transparent_white_stripe).
symptom(folder_inside_leaf_with_silk).
symptom(dry_leaf).

% X has symptom Y -------------------------------------------------------------------------

has_symptom(rice_hispa,leaf_white_thin_layer).				% <Insect no:1>
has_symptom(rice_hispa,dry_leaf_like_burning).

has_symptom(case_worm,no_top_level_of_leaf).				% <Insect no:2>
has_symptom(case_worm,many_circles_of_leaf_white_thin_layer).

has_symptom(rice_stemborer,stem_spoil).					% <Insect no:3>
has_symptom(rice_stemborer,white_grain).

has_symptom(rice_ear_bug,white_grain).					% <Insect no:4>

has_symptom(rice_ear_cutting_caterpillar,no_grain).			% <Insect no:5>

has_symptom(rice_gallmidge,puffy_scion).				% <Insect no:6>

has_symptom(rice_leaffolder,transparent_white_stripe).			% <Insect no:7>
has_symptom(rice_leaffolder,folder_inside_leaf_with_silk).
has_symptom(rice_leaffolder,dry_leaf).

has_symptom(rice_black_bug,stem_spoil).					% <Insect no:8>
has_symptom(rice_black_bug,no_grain).
has_symptom(rice_black_bug,dry_leaf_like_burning).

% If X has symptom Y, then X is Insect -------------------------------------------------------------------------

insect(rice_hispa) :- has_symptom(rice_hispa,leaf_white_thin_layer) , has_symptom(rice_hispa,dry_leaf_like_burning).								

insect(case_worm) :- has_symptom(case_worm,no_top_level_of_leaf),
has_symptom(case_worm,many_circles_of_leaf_white_thin_layer).

insect(rice_stemborer) :- has_symptom(rice_stemborer,stem_spoil),
has_symptom(rice_stemborer,white_grain).

insect(rice_ear_bug) :- has_symptom(rice_ear_bug,white_grain).

insect(rice_ear_cutting_caterpillar) :- has_symptom(rice_ear_cutting_caterpillar,no_grain).

insect(rice_gallmidge) :- has_symptom(rice_gallmidge,puffy_scion).

insect(rice_leaffolder) :- has_symptom(rice_leaffolder,transparent_white_stripe) , has_symptom(rice_leaffolder,folder_inside_leaf_with_silk) , has_symptom(rice_leaffolder,dry_leaf).

insect(rice_black_bug) :- has_symptom(rice_black_bug,stem_spoil) , has_symptom(rice_black_bug,no_grain) , has_symptom(rice_black_bug,dry_leaf_like_burning).




