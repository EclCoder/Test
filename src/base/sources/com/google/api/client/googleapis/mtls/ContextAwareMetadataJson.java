package com.google.api.client.googleapis.mtls;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class ContextAwareMetadataJson extends GenericJson {

    @Key("cert_provider_command")
    private List<String> commands;

    public final List<String> getCommands() {
        return this.commands;
    }
}
