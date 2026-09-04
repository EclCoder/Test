package com.bytedance.adsdk.ugeno.aq;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class hn {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private DataSetObserver f12163hn;
    private final DataSetObservable hnj = new DataSetObservable();

    public Parcelable hn() {
        return null;
    }

    public float hnj(int i10) {
        return 1.0f;
    }

    public abstract int hnj();

    public abstract boolean hnj(View view, Object obj);

    public void qor() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.f12163hn;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.hnj.notifyChanged();
    }

    public int hnj(Object obj) {
        return -1;
    }

    public Object hnj(ViewGroup viewGroup, int i10) {
        return hnj((View) viewGroup, i10);
    }

    public void hnj(ViewGroup viewGroup, int i10, Object obj) {
        hnj((View) viewGroup, i10, obj);
    }

    @Deprecated
    public Object hnj(View view, int i10) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @Deprecated
    public void hnj(View view, int i10, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    void hnj(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f12163hn = dataSetObserver;
        }
    }
}
