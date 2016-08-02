weed(common_barnyard_grass).
weed(chinese_sprangle_top).
weed(southern_cutgrass).
weed(greater_club_rush).
weed(less_fimbristylis).

% ----- Y is Disease -------------------------------------------------------------------

disease(rice_dwarf_virus).
disease(rice_stripe_virus).
disease(rice_blast).
disease(rice_yellow_dwarf).
disease(bacterial_leaf_blight).
disease(brown_spot).
disease(white_tip_nematode).
disease(dark_headed_rice_borer).
disease(rice_root_knot_nematode).
disease(rice_tungro_associated_virus).

solution(common_barnyard_grass,weed_soln1).
solution(common_barnyard_grass,weed_soln2).
solution(common_barnyard_grass,weed_soln3).
solution(common_barnyard_grass,weed_soln4).
solution(common_barnyard_grass,weed_soln5).
solution(common_barnyard_grass,weed_soln6).
solution(common_barnyard_grass,weed_soln7).
solution(common_barnyard_grass,weed_soln8).
solution(common_barnyard_grass,weed_soln9).
solution(common_barnyard_grass,weed_soln10).
solution(common_barnyard_grass,weed_soln11).

solution(chinese_sprangle_top,weed_soln11).

solution(southern_cutgrass,weed_soln11).

solution(rice_flatsedge,weed_soln11).

solution(greater_club_rush,weed_soln11).

solution(less_fimbristylis,weed_soln11).

% ----- X has Disease Y <Facts For Weed>----------------------------------------------------------------------

has(common_barnyard_grass,rice_dwarf_virus).		% <Weed no:1>
has(common_barnyard_grass,rice_stripe_virus).		
has(common_barnyard_grass,rice_blast).

has(chinese_sprangle_top,rice_yellow_dwarf).		% <Weed no:2>
has(chinese_sprangle_top,bacterial_leaf_blight).

has(southern_cutgrass,rice_yellow_dwarf).		% <Weed no:4>
has(southern_cutgrass,brown_spot).

has(greater_club_rush,dark_headed_rice_borer).		% <Weed no:6>

has(less_fimbristylis,rice_root_knot_nematode).		% <Weed no:7>
has(less_fimbristylis,rice_tungro_associated_virus).	



% ----- If X has Disease Y Then X is Weed <Rules For Weed>----------------------------------------------

cause(common_barnyard_grass) :- has(common_barnyard_grass,rice_dwarf_virus),
                              has(common_barnyard_grass,rice_stripe_virus),
                              has(common_barnyard_grass,rice_blast).

cause(chinese_sprangle_top) :- has(chinese_sprangle_top,rice_yellow_dwarf),			% <cause no:2>
                              has(chinese_sprangle_top,bacterial_leaf_blight),		
                             	

cause(southern_cutgrass) :- has(southern_cutgrass,rice_yellow_dwarf),				% <cause no:4>
                             has(southern_cutgrass,brown_spot).


cause(rice_flatsedge) :- has(greater_club_rush,dark_headed_rice_borer).				% <cause no:5>

cause(greater_club_rush) :- has(greater_club_rush,dark_headed_rice_borer).			% <cause no:6>

cause(less_fimbristylis) :- has(less_fimbristylis,rice_root_knot_nematode),					% <cause no:7>
                            has(less_fimbristylis,rice_tungro_associated_virus).
