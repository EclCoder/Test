package com.google.android.material.navigation;

import android.view.MenuItem;
import android.view.SubMenu;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.appcompat.view.menu.e f20608a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20610c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20611d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20612e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f20609b = new ArrayList();

    h(androidx.appcompat.view.menu.e eVar) {
        this.f20608a = eVar;
        f();
    }

    public int a() {
        return this.f20610c;
    }

    public MenuItem b(int i10) {
        return (MenuItem) this.f20609b.get(i10);
    }

    public int c() {
        return this.f20611d;
    }

    public int d() {
        return this.f20612e;
    }

    public boolean e(MenuItem menuItem, androidx.appcompat.view.menu.j jVar, int i10) {
        return this.f20608a.P(menuItem, jVar, i10);
    }

    public void f() {
        this.f20609b.clear();
        this.f20610c = 0;
        this.f20611d = 0;
        this.f20612e = 0;
        for (int i10 = 0; i10 < this.f20608a.size(); i10++) {
            MenuItem item = this.f20608a.getItem(i10);
            if (item.hasSubMenu()) {
                if (!this.f20609b.isEmpty()) {
                    List list = this.f20609b;
                    if (!(list.get(list.size() - 1) instanceof a) && item.isVisible()) {
                        this.f20609b.add(new a());
                    }
                }
                this.f20609b.add(item);
                SubMenu subMenu = item.getSubMenu();
                for (int i11 = 0; i11 < subMenu.size(); i11++) {
                    MenuItem item2 = subMenu.getItem(i11);
                    if (!item.isVisible()) {
                        item2.setVisible(false);
                    }
                    this.f20609b.add(item2);
                    this.f20610c++;
                    if (item2.isVisible()) {
                        this.f20611d++;
                    }
                }
                this.f20609b.add(new a());
            } else {
                this.f20609b.add(item);
                this.f20610c++;
                if (item.isVisible()) {
                    this.f20611d++;
                    this.f20612e++;
                }
            }
        }
        if (this.f20609b.isEmpty()) {
            return;
        }
        List list2 = this.f20609b;
        if (list2.get(list2.size() - 1) instanceof a) {
            List list3 = this.f20609b;
            list3.remove(list3.size() - 1);
        }
    }

    public int g() {
        return this.f20609b.size();
    }
}
