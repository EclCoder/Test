package l0;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements Spannable {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextPaint f43709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TextDirectionHeuristic f43710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f43711c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f43712d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final PrecomputedText.Params f43713e;

        /* JADX INFO: renamed from: l0.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static class C0663a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final TextPaint f43714a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f43716c = 1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f43717d = 1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f43715b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C0663a(TextPaint textPaint) {
                this.f43714a = textPaint;
            }

            public a a() {
                return new a(this.f43714a, this.f43715b, this.f43716c, this.f43717d);
            }

            public C0663a b(int i10) {
                this.f43716c = i10;
                return this;
            }

            public C0663a c(int i10) {
                this.f43717d = i10;
                return this;
            }

            public C0663a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f43715b = textDirectionHeuristic;
                return this;
            }
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f43713e = b.a(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f43713e = null;
            }
            this.f43709a = textPaint;
            this.f43710b = textDirectionHeuristic;
            this.f43711c = i10;
            this.f43712d = i11;
        }

        public boolean a(a aVar) {
            if (this.f43711c != aVar.b() || this.f43712d != aVar.c() || this.f43709a.getTextSize() != aVar.e().getTextSize() || this.f43709a.getTextScaleX() != aVar.e().getTextScaleX() || this.f43709a.getTextSkewX() != aVar.e().getTextSkewX() || this.f43709a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.f43709a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) || this.f43709a.getFlags() != aVar.e().getFlags() || !this.f43709a.getTextLocales().equals(aVar.e().getTextLocales())) {
                return false;
            }
            if (this.f43709a.getTypeface() == null) {
                return aVar.e().getTypeface() == null;
            }
            return this.f43709a.getTypeface().equals(aVar.e().getTypeface());
        }

        public int b() {
            return this.f43711c;
        }

        public int c() {
            return this.f43712d;
        }

        public TextDirectionHeuristic d() {
            return this.f43710b;
        }

        public TextPaint e() {
            return this.f43709a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f43710b == aVar.d();
        }

        public int hashCode() {
            return m0.b.b(Float.valueOf(this.f43709a.getTextSize()), Float.valueOf(this.f43709a.getTextScaleX()), Float.valueOf(this.f43709a.getTextSkewX()), Float.valueOf(this.f43709a.getLetterSpacing()), Integer.valueOf(this.f43709a.getFlags()), this.f43709a.getTextLocales(), this.f43709a.getTypeface(), Boolean.valueOf(this.f43709a.isElegantTextHeight()), this.f43710b, Integer.valueOf(this.f43711c), Integer.valueOf(this.f43712d));
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f43709a.getTextSize());
            sb2.append(", textScaleX=" + this.f43709a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f43709a.getTextSkewX());
            sb2.append(", letterSpacing=" + this.f43709a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f43709a.isElegantTextHeight());
            int i10 = Build.VERSION.SDK_INT;
            sb2.append(", textLocale=" + this.f43709a.getTextLocales());
            sb2.append(", typeface=" + this.f43709a.getTypeface());
            if (i10 >= 26) {
                sb2.append(", variationSettings=" + this.f43709a.getFontVariationSettings());
            }
            sb2.append(", textDir=" + this.f43710b);
            sb2.append(", breakStrategy=" + this.f43711c);
            sb2.append(", hyphenationFrequency=" + this.f43712d);
            sb2.append("}");
            return sb2.toString();
        }

        public a(PrecomputedText.Params params) {
            this.f43709a = params.getTextPaint();
            this.f43710b = params.getTextDirection();
            this.f43711c = params.getBreakStrategy();
            this.f43712d = params.getHyphenationFrequency();
            this.f43713e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
