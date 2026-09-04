package pl.droidsonroids.gif;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class GifImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f50166a;

    public GifImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a(f.c(this, attributeSet, i10, 0));
    }

    private void a(f.a aVar) {
        this.f50166a = aVar.f50235a;
        int i10 = aVar.f50233c;
        if (i10 > 0) {
            super.setImageResource(i10);
        }
        int i11 = aVar.f50234d;
        if (i11 > 0) {
            super.setBackgroundResource(i11);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        eVar.a(getDrawable(), 0);
        eVar.a(getBackground(), 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new e(super.onSaveInstanceState(), this.f50166a ? getDrawable() : null, this.f50166a ? getBackground() : null);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        if (f.e(this, false, i10)) {
            return;
        }
        super.setBackgroundResource(i10);
    }

    public void setFreezesAnimation(boolean z10) {
        this.f50166a = z10;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        if (f.e(this, true, i10)) {
            return;
        }
        super.setImageResource(i10);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        if (f.d(this, uri)) {
            return;
        }
        super.setImageURI(uri);
    }
}
