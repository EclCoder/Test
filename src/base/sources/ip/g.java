package ip;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class g {
    public static boolean a(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (Character.isWhitespace(charSequence.charAt(i10))) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(CharSequence charSequence) {
        if (charSequence == null) {
            return true;
        }
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!Character.isWhitespace(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }
}
