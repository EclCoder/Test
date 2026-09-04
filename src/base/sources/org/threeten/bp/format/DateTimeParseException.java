package org.threeten.bp.format;

import org.threeten.bp.DateTimeException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class DateTimeParseException extends DateTimeException {
    private static final long serialVersionUID = 4304633501674722597L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f49442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f49443b;

    public DateTimeParseException(String str, CharSequence charSequence, int i10) {
        super(str);
        this.f49442a = charSequence.toString();
        this.f49443b = i10;
    }
}
