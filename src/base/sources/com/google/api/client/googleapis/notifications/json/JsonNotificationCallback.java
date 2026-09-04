package com.google.api.client.googleapis.notifications.json;

import com.google.api.client.googleapis.notifications.TypedNotificationCallback;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class JsonNotificationCallback<T> extends TypedNotificationCallback<T> {
    private static final long serialVersionUID = 1;

    protected abstract JsonFactory getJsonFactory();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.api.client.googleapis.notifications.TypedNotificationCallback
    public final JsonObjectParser getObjectParser() {
        return new JsonObjectParser(getJsonFactory());
    }
}
