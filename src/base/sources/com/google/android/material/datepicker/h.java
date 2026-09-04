package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class h extends BaseAdapter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f19904d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Calendar f19905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f19906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f19907c;

    static {
        f19904d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public h() {
        Calendar calendarI = v.i();
        this.f19905a = calendarI;
        this.f19906b = calendarI.getMaximum(7);
        this.f19907c = calendarI.getFirstDayOfWeek();
    }

    private int b(int i10) {
        int i11 = i10 + this.f19907c;
        int i12 = this.f19906b;
        return i11 > i12 ? i11 - i12 : i11;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i10) {
        if (i10 >= this.f19906b) {
            return null;
        }
        return Integer.valueOf(b(i10));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f19906b;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(sb.i.A, viewGroup, false);
        }
        this.f19905a.set(7, b(i10));
        textView.setText(this.f19905a.getDisplayName(7, f19904d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(sb.k.H), this.f19905a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public h(int i10) {
        Calendar calendarI = v.i();
        this.f19905a = calendarI;
        this.f19906b = calendarI.getMaximum(7);
        this.f19907c = i10;
    }
}
