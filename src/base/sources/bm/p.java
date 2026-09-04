package bm;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p {
    /* JADX INFO: Access modifiers changed from: private */
    public static final l e(Matcher matcher, int i10, CharSequence charSequence) {
        if (matcher.find(i10)) {
            return new m(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l f(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new m(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yl.f g(MatchResult matchResult) {
        return yl.g.m(matchResult.start(), matchResult.end());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yl.f h(MatchResult matchResult, int i10) {
        return yl.g.m(matchResult.start(i10), matchResult.end(i10));
    }
}
