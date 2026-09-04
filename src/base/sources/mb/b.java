package mb;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f45412g = new b(-1, -16777216, 0, 0, -1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f45416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f45417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Typeface f45418f;

    public b(int i10, int i11, int i12, int i13, int i14, Typeface typeface) {
        this.f45413a = i10;
        this.f45414b = i11;
        this.f45415c = i12;
        this.f45416d = i13;
        this.f45417e = i14;
        this.f45418f = typeface;
    }

    public static b a(CaptioningManager.CaptionStyle captionStyle) {
        return r0.f48425a >= 21 ? c(captionStyle) : b(captionStyle);
    }

    private static b b(CaptioningManager.CaptionStyle captionStyle) {
        return new b(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    private static b c(CaptioningManager.CaptionStyle captionStyle) {
        return new b(captionStyle.hasForegroundColor() ? captionStyle.foregroundColor : f45412g.f45413a, captionStyle.hasBackgroundColor() ? captionStyle.backgroundColor : f45412g.f45414b, captionStyle.hasWindowColor() ? captionStyle.windowColor : f45412g.f45415c, captionStyle.hasEdgeType() ? captionStyle.edgeType : f45412g.f45416d, captionStyle.hasEdgeColor() ? captionStyle.edgeColor : f45412g.f45417e, captionStyle.getTypeface());
    }
}
