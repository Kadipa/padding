import java.util.Hashtable;

public class Utils {

	private static String[] images = { "bacterial_leaf_blight.jpg", "rice_dwarf_virus.jpg", "rice_stripe_virus.jpg",
			"rice_blast.jpg", "rice_yellow_dwarf.jpg", "case_worm.jpg", "brown_spot.jpg", "white_tip_nematode.jpg",
			"dark_headed_rice_borer.jpg", "rice_root_knot_nematode.jpg", "rice_tungro_associated_virus.jpg" };
	private static String[] disease = { "common_barnyard_grass", "rice_dwarf_virus", "rice_stripe_virus", "rice_blast",
			"chinese_sprangle_top", "rice_yellow_dwarf", "bacterial_leaf_blight", "southern_cutgrass", "brown_spot",
			"greater_club_rush", "dark_headed_rice_borer", "less_fimbristylis", "rice_root_knot_nematode",
			"rice_tungro_associated_virus", "january", "february", "march", "april", "may", "june", "july", "august",
			"september", "october", "november", "december", "wet_field", "flooded_field", "muddy_field",
			"leaf_white_thin_layer", "dry_leaf_like_burning", "no_top_level_of_leaf",
			"many_circles_of_leaf_white_thin_layer", "stem_spoil", "white_grain", "small_grain", "no_grain",
			"puffy_scion", "transparent_white_stripe", "folder_inside_leaf_with_silk", "dry_leaf", "rice_stemborer",
			"rice_ear_bug", "rice_ear_cutting_caterpillar", "rice_gallmidge" };

	private static String[] disease1 = { "ျမက္သီး", "စပါးပင္ပုဗိုင္းရပ္စ္ေရာဂါ", "စပါးရြက္စင္းဗိုင္းရပ္စပ္ေရာဂါ",
			"စပါးဂုတ္က်ိဳးေရာဂါ", "ေဒါင္းျမီးပ်ံေရာဂါ", "စပါးအဝါေရာင္ပင္ပုေရာဂါ", "ဘတ္တီးရီးယားရြက္ေျခာက္ေရာဂါ",
			"သမန္းျမက္", "စပါးျဖဳတ္ညိဳ ", "ျမက္မုံညင္းအဝါ", "စပါးရြက္ဖ်ားျဖဴနီမတုတ္", "ဝက္လာ", "စပါးပင္စည္ထိုးပိုး",
			"ျမက္ကြမ္းသီးေလး", "တန္ဂရိုဗိုင္းရပ္စ္ေရာဂါ", "ဇန္နဝါရီ", "ေဖေဖာ္ဝါရီ", "မတ္", "ဧျပီ", "ေမ", "ဇြန္",
			"ဇူလိုင္", "ၾသဂုတ္", "စက္တင္ဘာ", "ေအာက္တိုဘာ", "နိုဝင္ဘာ", "ဒီဇင္ဘာ", "စြတ္စိုေသာေျမ", "ေရလႊမ္းေျမ",
			"ရြံံ႕ေျမ", "စပါးရြက္သည္အျဖဴေရာင္အေျမွးပါးသာ က်န္ရစ္", "မီးေလာင္သကဲ့သို႔ ေျခာက္လာ", "စပါးရြက္ထိပ္ျပတ္သည္",
			"အျဖဴေရာင္အေျမွးပါးမ်ား အကြက္လိုက္ေတြ႔ရ", "ပင္စည္ပုပ္", "အနွံျဖဴလာ", "စပါးေစ့မ်ား ပိုမိုေသးငယ္ေစ",
			"အနွံမ်ား ကိုက္ျဖတ္ခံရ", "ပင္ပြားေရာင္ရမ္း", "အလင္းေပါက္သည့္ အျဖဴေရာင္အစင္းမ်ား ေတြ႔ရ",
			"အရြက္ဖ်ားမ်ားကို ပိုးခ်ည္ျဖင့္ အတြင္းဘက္သို႔ ေခါက္ထား", "အရြက္မ်ား ေျခာက္", "စပါးဆစ္ပိုးမ်ား",
			"စပါးနွံစုပ္ ဂ်ပိုး", "နွံျဖတ္ပိုး", "ၾကက္သြန္ျမိတ္ပိုး"

	};

	private static String[] solutions = { "weed_soln1", "weed_soln2", "weed_soln3", "weed_soln4", "weed_soln5",
			"weed_soln6", "weed_soln7", "weed_soln8", "weed_soln9", "weed_soln10", "weed_soln11" };

	public static String[] solutionsMM = {
			"ေပါင္းေစ့မ်ားသည္ မ်ိဳးအျဖစ္ အသံုးျပဳမည့္စပါးမ်ိဳးေစ့မ်ားနွွင့္အတူ ေရာပါလာပါမည္။",
			" မစိုက္မီ ဆန္ကာခ်ျခင္း၊ေရစိမ္ျခင္း၊ ဆားေရစိမ္ျခင္း တုိ႔ ျပဳလုပ္ ဖယ္ရွားေပးျခင္းအားျဖင့္ ေပါင္းေစ့မ်ား စိုက္ခင္းသို႕ ပါမသြားေစနိုင္ရန္ ျပဳလုပ္နိင္သည္။ ",
			"တုိက္ရိုက္အေစ့ခ် စိုက္စပါးခင္းမ်ား၌ ဆုိးရြားလာေသာ ျမက္သီးျပႆနာမ်ားကို ဤနည္းျဖင့္ကာကြယ္နိင္သည္ ။",
			"ျမက္သီးအေစ့မ်ားသည္ မ်ိဳးစပါးမ်ားနွင့္ ေရာေနွာလာသျဖင့္ ေဒသအသစ္မ်ား၌ ျမက္သီးျပႆနာျပန္႔နွံ႕လာသည္။",
			" ျမက္သီး အနွံမ်ားသည္ စပါးပင္ထက္ ပိုျမင့္သျဖင့္ ထင္ရွားေပၚလြင္ေနတတ္သည္။ ",
			"အေျခအေန ေပးပါက စပါးမရိတ္မွီ ျမက္သီးအနွံမ်ားကို ေျမေပၚသို႕ ေပါင္းေစ့မ်ား မက်ေရာက္နိင္ျခင္း ၊စပါးေစ့မ်ားနွင့္ ေရာေနွာ ပါသြားျခင္း မရွိနိုင္ပါ။",
			"ဤသို႕ နွစ္စဥ္ ျပဳလုပ္ျခင္းျဖင့္ ျမက္သီးျပႆနာ တျဖည္းျဖည္း နည္းပါးသြားးပါမည္။",
			"ေျမျပဳျပင္ရာ၌ ျမက္ေခါင္းမ်ား ၊ ရိုင္ဇုမ္းမ်ား၊ က်ဴဘာစသည့္ ေျမေအာက္မ်ိဳးပြား အစိတ္အပိုင္းမ်ားကုိ ေျပာင္စင္ေအာင္ ေကာက္ေပးျခင္းျဖင့္ ဝက္လာကဲ့သို႕ နွစ္ရွည္ေပါင္းမ်ား ေပါက္ေရာက္မွဳ ေလ်ာ့နည္းေစသည္။",
			"ေပါင္းသက္ေဆး သံုးစြဲမည္ဆုိပါက သီးနွံနွင့္ ေပါက္ေရာက္သည့္ ေပါင္းအမ်ိဳးအစားလုိက္၍ ေပါင္းသက္ေဆး ေရြးခ်ယ္မွဳ မွန္ကန္ရမည္။",
			"၄င္းအျပင္ ယပ္ေတာင္ပံုပါေသာ ေဆးရည္မ်ားထြက္ေသာ ပိုးသတ္ေဆးေခါင္းကို အသံုးျပဳရမည္။ ပိုးသတ္ေဆးပံုးမ်ား၏ ပိုးသတ္ေဆး ဖ်န္းေခါင္းမ်ားသည္ ကေတာ့ပံုေဆးရည္ ထြက္ပါသည္။",
			"ေပါင္းသတ္ေဆးဖ်န္းရန္အတြက္ ေဆးဖ်န္းပံုး ဝယ္လွ်င္ ယပ္ေတာင္ပံု ေဆးရည္ထြက္ေသာ ေဆးဖ်န္းေခါင္း ပါ မပါ ကို ဆို္င္တြင္ ေမးျမန္း၍ ဝယ္ယူပါ။" };

	public static String getImage(String key) {
		for (int i = 0; i < disease.length; i++) {
			if (key.equals(disease[i])) {
				return images[i];
			}
		}
		return null;
	}

	public static String getMMSol(String key) {
		for (int i = 0; i < solutions.length; i++) {
			if (key.equals(solutions[i])) {
				return solutionsMM[i];
			}
		}
		return null;
	}

	public static String getMMStr(String key) {
		for (int i = 0; i < disease.length; i++) {
			if (key.equals(disease[i])) {
				return disease1[i];
			}
		}
		return null;
	}
	
	@SuppressWarnings("rawtypes")
	public static String[] Hashtable2String(Hashtable[] data,String key){
		String[] returnData=new String[data.length];
		int index=0;
		for (Hashtable element:data){
			returnData[index]=element.get(key).toString();
			index++;
		}
		return returnData;
	}
	
	public static String[] Hashtable2String(Hashtable[] data,String key,String excludeKey){
		String[] returnData=new String[data.length-1];
		int index=0;
		for (Hashtable element:data){
			if (!element.get(key).toString().equals(excludeKey)){
				returnData[index]=element.get(key).toString();
				index++;
			}
		}
		return returnData;
	}

}
