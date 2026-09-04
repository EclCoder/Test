package o0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f47918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f47919c;

    public a(int i10, p pVar, int i11) {
        this.f47917a = i10;
        this.f47918b = pVar;
        this.f47919c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f47917a);
        this.f47918b.j0(this.f47919c, bundle);
    }
}
