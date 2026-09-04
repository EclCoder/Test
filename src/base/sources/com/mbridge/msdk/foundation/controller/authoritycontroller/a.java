package com.mbridge.msdk.foundation.controller.authoritycontroller;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f30160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f30161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f30162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f30163d;

    protected void a(int i10) {
        this.f30160a = i10;
        this.f30161b = i10;
        this.f30162c = i10;
    }

    public void authDeviceIdStatus(int i10) {
        this.f30161b = i10;
    }

    public void authGenDataStatus(int i10) {
        this.f30160a = i10;
    }

    public void authOtherDataStatus(int i10) {
        this.f30163d = i10;
    }

    public void authSerialIdStatus(int i10) {
        this.f30162c = i10;
    }

    public int getAuthDeviceIdStatus() {
        return this.f30161b;
    }

    public int getAuthGenDataStatus() {
        return this.f30160a;
    }

    public int getAuthSerialIdStatus() {
        return this.f30162c;
    }

    public int getOtherDataStatus() {
        return this.f30163d;
    }

    public int getStatusByKey(String str) {
        if (!TextUtils.isEmpty(str)) {
            str.getClass();
            switch (str) {
                case "authority_serial_id":
                    return this.f30162c;
                case "authority_device_id":
                    return this.f30161b;
                case "authority_general_data":
                    return this.f30160a;
                case "authority_other":
                    return this.f30163d;
            }
        }
        return 1;
    }
}
