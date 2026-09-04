package bm;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class o implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9147b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Pattern f9148a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(int i10) {
            return (i10 & 2) != 0 ? i10 | 64 : i10;
        }

        public final String c(String literal) {
            kotlin.jvm.internal.s.h(literal, "literal");
            String strQuote = Pattern.quote(literal);
            kotlin.jvm.internal.s.g(strQuote, "quote(...)");
            return strQuote;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f9149c = new a(null);
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f9151b;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public b(String pattern, int i10) {
            kotlin.jvm.internal.s.h(pattern, "pattern");
            this.f9150a = pattern;
            this.f9151b = i10;
        }

        private final Object readResolve() {
            Pattern patternCompile = Pattern.compile(this.f9150a, this.f9151b);
            kotlin.jvm.internal.s.g(patternCompile, "compile(...)");
            return new o(patternCompile);
        }
    }

    public o(Pattern nativePattern) {
        kotlin.jvm.internal.s.h(nativePattern, "nativePattern");
        this.f9148a = nativePattern;
    }

    public static /* synthetic */ l c(o oVar, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return oVar.b(charSequence, i10);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        String strPattern = this.f9148a.pattern();
        kotlin.jvm.internal.s.g(strPattern, "pattern(...)");
        return new b(strPattern, this.f9148a.flags());
    }

    public final boolean a(CharSequence input) {
        kotlin.jvm.internal.s.h(input, "input");
        return this.f9148a.matcher(input).find();
    }

    public final l b(CharSequence input, int i10) {
        kotlin.jvm.internal.s.h(input, "input");
        Matcher matcher = this.f9148a.matcher(input);
        kotlin.jvm.internal.s.g(matcher, "matcher(...)");
        return p.e(matcher, i10, input);
    }

    public final String d() {
        String strPattern = this.f9148a.pattern();
        kotlin.jvm.internal.s.g(strPattern, "pattern(...)");
        return strPattern;
    }

    public final l e(CharSequence input, int i10) {
        kotlin.jvm.internal.s.h(input, "input");
        Matcher matcherRegion = this.f9148a.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i10, input.length());
        if (!matcherRegion.lookingAt()) {
            return null;
        }
        kotlin.jvm.internal.s.e(matcherRegion);
        return new m(matcherRegion, input);
    }

    public final l g(CharSequence input) {
        kotlin.jvm.internal.s.h(input, "input");
        Matcher matcher = this.f9148a.matcher(input);
        kotlin.jvm.internal.s.g(matcher, "matcher(...)");
        return p.f(matcher, input);
    }

    public final boolean h(CharSequence input) {
        kotlin.jvm.internal.s.h(input, "input");
        return this.f9148a.matcher(input).matches();
    }

    public final String i(CharSequence input, String replacement) {
        kotlin.jvm.internal.s.h(input, "input");
        kotlin.jvm.internal.s.h(replacement, "replacement");
        String strReplaceAll = this.f9148a.matcher(input).replaceAll(replacement);
        kotlin.jvm.internal.s.g(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final List j(CharSequence input, int i10) {
        kotlin.jvm.internal.s.h(input, "input");
        f0.A0(i10);
        Matcher matcher = this.f9148a.matcher(input);
        if (i10 == 1 || !matcher.find()) {
            return gl.r.e(input.toString());
        }
        ArrayList arrayList = new ArrayList(i10 > 0 ? yl.g.f(i10, 10) : 10);
        int i11 = i10 - 1;
        int iEnd = 0;
        do {
            arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i11 >= 0 && arrayList.size() == i11) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(iEnd, input.length()).toString());
        return arrayList;
    }

    public String toString() {
        String string = this.f9148a.toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o(String pattern) {
        kotlin.jvm.internal.s.h(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        kotlin.jvm.internal.s.g(patternCompile, "compile(...)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o(String pattern, q option) {
        kotlin.jvm.internal.s.h(pattern, "pattern");
        kotlin.jvm.internal.s.h(option, "option");
        Pattern patternCompile = Pattern.compile(pattern, f9147b.b(option.g()));
        kotlin.jvm.internal.s.g(patternCompile, "compile(...)");
        this(patternCompile);
    }
}
