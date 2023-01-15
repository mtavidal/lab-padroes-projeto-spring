package one.digitalinnovation.gof.strategy;

import one.digitalinnovation.gof.notification.EmailDesconto;
import one.digitalinnovation.gof.notification.EmailFreteGratis;
import one.digitalinnovation.gof.notification.EmailSemDesconto;
import one.digitalinnovation.gof.notification.NotificacaoViaEmail;

public enum DescontoStrategy {
    CAPITAL {
        @Override
        public NotificacaoViaEmail getTemplateEmail() {
            return new EmailFreteGratis();
        }
    },
    REGIAO_METROPOLITANA {
        @Override
        public NotificacaoViaEmail getTemplateEmail() {
            return new EmailDesconto();
        }
    },

    INTERIOR {
        @Override
        public NotificacaoViaEmail getTemplateEmail() {
            return new EmailSemDesconto();
        }
    };

    public abstract NotificacaoViaEmail getTemplateEmail();
}
