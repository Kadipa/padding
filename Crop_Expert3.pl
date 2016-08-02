% ----- Types of Field -------------------------------------------------------------------------

field(wet_field).
field(flooded_field).
field(muddy_field).

disease(common_barnyard_grass).
disease(chinese_sprangle_top).
disease(saramolla_grass).
disease(southern_cutgrass).
disease(rice_flatsedge).
disease(lesser_fimbristylis).
disease(pickerel_weed).
disease().
disease().
disease().
disease().


%----- Y grows in Field X -----------------------------------------------------------------------

grow(wet_field,common_barnyard_grass).			% <Weed no:1>
grow(flooded_field,common_banyard_grass).

grow(muddy_field,chinese_sprangle_top).			% <Weed no:2>

grow(wet_field,saramolla_grass).			% <Weed no:3>

grow(flooded_field,southern_cutgrass).			% <Weed no:4>

grow(wet_field,rice_flatsedge).				% <Weed no:5>

grow(wet_field,lesser_fimbristylis).			% <Weed no:6>

grow(wet_field,pickerel_weed).				% <Weed no:7>
grow(flooded_field,pickerel_weed).

grow(wet_field,primroise_willow).			% <Weed no:8>
grow(flooded_field,primroise_willow).

grow(wet_field,goose_weed).				% <Weed no:9>
grow(flooded_field,goose_weed).

grow(flooded_field,water_clover).			% <Weed no:10>

grow(flooded_field,waterhyacinth).			% <Weed no:11>


% ----- If Y grows in Field X, then X is Weed ----------------------------------------------------

weed(common_banyard_grass) :- grow(wet_field,common_barnyard_grass).		% <Weed no:1>
weed(common_banyard_grass) :- grow(flooded_field,common_barnyard_grass).

weed(chinese_sprangle_top) :- grow(muddy_field,chinese_sprangle_top).		% <Weed no:2>

weed(saramolla_grass) :- grow(wet_field,saramolla_grass).			% <Weed no:3>

weed(southern_cutgrass) :- grow(flooded_field,southern_cutgrass).		% <Weed no:4>

weed(rice_flatsedge) :- grow(wet_field,rice_flatsedge).				% <Weed no:5>

weed(lesser_fimbristylis) :- grow(wet_field,lesser_fimbristylis).		% <Weed no:6>

weed(pickerel_weed) :- grow(wet_field,pickerel_weed).				% <Weed no:7>
weed(pickerel_weed) :- grow(flooded_field,pickerel_weed).

weed(primroise_willow) :- grow(wet_field,primroise_willow).			% <Weed no:8>
weed(primroise_willow) :- grow(flooded_field,primroise_willow).

weed(goose_weed) :- grow(wet_field,goose_weed).					% <Weed no:9>
weed(goose_weed) :- grow(flooded_field,goose_weed).

weed(water_clover) :- grow(flooded_field,water_clover).				% <Weed no:10>

weed(waterhyacinth) :- grow(flooded_field,waterhyacinth).			% <Weed no:11>