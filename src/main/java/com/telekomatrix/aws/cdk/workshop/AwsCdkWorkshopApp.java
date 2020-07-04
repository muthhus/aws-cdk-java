package com.telekomatrix.aws.cdk.workshop;

import software.amazon.awscdk.core.App;

public final class AwsCdkWorkshopApp {
    public static void main(final String[] args) {
        App app = new App();

        new AwsCdkWorkshopStack(app, "CdkWorkshopStack");

        app.synth();
    }
}
