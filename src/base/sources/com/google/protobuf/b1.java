package com.google.protobuf;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class b1 {
    private final Field caseField;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f22449id;
    private final Field valueField;

    public b1(int i10, Field field, Field field2) {
        this.f22449id = i10;
        this.caseField = field;
        this.valueField = field2;
    }

    public Field getCaseField() {
        return this.caseField;
    }

    public int getId() {
        return this.f22449id;
    }

    public Field getValueField() {
        return this.valueField;
    }
}
