package s0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f51449i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f51450j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private LayoutInflater f51451k;

    public c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f51450j = i10;
        this.f51449i = i10;
        this.f51451k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // s0.a
    public View f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f51451k.inflate(this.f51450j, viewGroup, false);
    }

    @Override // s0.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f51451k.inflate(this.f51449i, viewGroup, false);
    }
}
