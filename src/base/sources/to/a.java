package to;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class a {
    private static boolean a(char c10) {
        return c10 >= 'A' && c10 <= 'Z';
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        int i10 = 0;
        while (length > 0 && !a(str.charAt(i10))) {
            i10++;
            length--;
        }
        if (length <= 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        sb2.append((CharSequence) str, 0, i10);
        while (length > 0) {
            char cCharAt = str.charAt(i10);
            if (a(cCharAt)) {
                sb2.append((char) (cCharAt + ' '));
            } else {
                sb2.append(cCharAt);
            }
            i10++;
            length--;
        }
        return sb2.toString();
    }
}
