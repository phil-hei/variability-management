package org.itea2.amalthea.variability.dependency.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.itea2.amalthea.variability.dependency.services.DependencyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDependencyParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'>'", "'<'", "'=>'", "'<='", "'[FlatDependency]'", "'[HierarchicalDependency]'", "'(Exclusive)'", "'StructureElements:'", "'Properties:'", "'SystemPart:'", "'Type:'", "'('", "')'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDependencyParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDependencyParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDependencyParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDependency.g"; }


    	private DependencyGrammarAccess grammarAccess;

    	public void setGrammarAccess(DependencyGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleDependency"
    // InternalDependency.g:53:1: entryRuleDependency : ruleDependency EOF ;
    public final void entryRuleDependency() throws RecognitionException {
        try {
            // InternalDependency.g:54:1: ( ruleDependency EOF )
            // InternalDependency.g:55:1: ruleDependency EOF
            {
             before(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_1);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getDependencyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // InternalDependency.g:62:1: ruleDependency : ( ( rule__Dependency__Alternatives ) ) ;
    public final void ruleDependency() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:66:2: ( ( ( rule__Dependency__Alternatives ) ) )
            // InternalDependency.g:67:2: ( ( rule__Dependency__Alternatives ) )
            {
            // InternalDependency.g:67:2: ( ( rule__Dependency__Alternatives ) )
            // InternalDependency.g:68:3: ( rule__Dependency__Alternatives )
            {
             before(grammarAccess.getDependencyAccess().getAlternatives()); 
            // InternalDependency.g:69:3: ( rule__Dependency__Alternatives )
            // InternalDependency.g:69:4: rule__Dependency__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Dependency__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDependencyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleFlatDependency"
    // InternalDependency.g:78:1: entryRuleFlatDependency : ruleFlatDependency EOF ;
    public final void entryRuleFlatDependency() throws RecognitionException {
        try {
            // InternalDependency.g:79:1: ( ruleFlatDependency EOF )
            // InternalDependency.g:80:1: ruleFlatDependency EOF
            {
             before(grammarAccess.getFlatDependencyRule()); 
            pushFollow(FOLLOW_1);
            ruleFlatDependency();

            state._fsp--;

             after(grammarAccess.getFlatDependencyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFlatDependency"


    // $ANTLR start "ruleFlatDependency"
    // InternalDependency.g:87:1: ruleFlatDependency : ( ( rule__FlatDependency__Group__0 ) ) ;
    public final void ruleFlatDependency() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:91:2: ( ( ( rule__FlatDependency__Group__0 ) ) )
            // InternalDependency.g:92:2: ( ( rule__FlatDependency__Group__0 ) )
            {
            // InternalDependency.g:92:2: ( ( rule__FlatDependency__Group__0 ) )
            // InternalDependency.g:93:3: ( rule__FlatDependency__Group__0 )
            {
             before(grammarAccess.getFlatDependencyAccess().getGroup()); 
            // InternalDependency.g:94:3: ( rule__FlatDependency__Group__0 )
            // InternalDependency.g:94:4: rule__FlatDependency__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FlatDependency__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFlatDependencyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFlatDependency"


    // $ANTLR start "entryRuleHierarchicalDependency"
    // InternalDependency.g:103:1: entryRuleHierarchicalDependency : ruleHierarchicalDependency EOF ;
    public final void entryRuleHierarchicalDependency() throws RecognitionException {
        try {
            // InternalDependency.g:104:1: ( ruleHierarchicalDependency EOF )
            // InternalDependency.g:105:1: ruleHierarchicalDependency EOF
            {
             before(grammarAccess.getHierarchicalDependencyRule()); 
            pushFollow(FOLLOW_1);
            ruleHierarchicalDependency();

            state._fsp--;

             after(grammarAccess.getHierarchicalDependencyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHierarchicalDependency"


    // $ANTLR start "ruleHierarchicalDependency"
    // InternalDependency.g:112:1: ruleHierarchicalDependency : ( ( rule__HierarchicalDependency__Group__0 ) ) ;
    public final void ruleHierarchicalDependency() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:116:2: ( ( ( rule__HierarchicalDependency__Group__0 ) ) )
            // InternalDependency.g:117:2: ( ( rule__HierarchicalDependency__Group__0 ) )
            {
            // InternalDependency.g:117:2: ( ( rule__HierarchicalDependency__Group__0 ) )
            // InternalDependency.g:118:3: ( rule__HierarchicalDependency__Group__0 )
            {
             before(grammarAccess.getHierarchicalDependencyAccess().getGroup()); 
            // InternalDependency.g:119:3: ( rule__HierarchicalDependency__Group__0 )
            // InternalDependency.g:119:4: rule__HierarchicalDependency__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HierarchicalDependency__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHierarchicalDependencyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHierarchicalDependency"


    // $ANTLR start "entryRuleSystemPart"
    // InternalDependency.g:128:1: entryRuleSystemPart : ruleSystemPart EOF ;
    public final void entryRuleSystemPart() throws RecognitionException {
        try {
            // InternalDependency.g:129:1: ( ruleSystemPart EOF )
            // InternalDependency.g:130:1: ruleSystemPart EOF
            {
             before(grammarAccess.getSystemPartRule()); 
            pushFollow(FOLLOW_1);
            ruleSystemPart();

            state._fsp--;

             after(grammarAccess.getSystemPartRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSystemPart"


    // $ANTLR start "ruleSystemPart"
    // InternalDependency.g:137:1: ruleSystemPart : ( ( rule__SystemPart__Group__0 ) ) ;
    public final void ruleSystemPart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:141:2: ( ( ( rule__SystemPart__Group__0 ) ) )
            // InternalDependency.g:142:2: ( ( rule__SystemPart__Group__0 ) )
            {
            // InternalDependency.g:142:2: ( ( rule__SystemPart__Group__0 ) )
            // InternalDependency.g:143:3: ( rule__SystemPart__Group__0 )
            {
             before(grammarAccess.getSystemPartAccess().getGroup()); 
            // InternalDependency.g:144:3: ( rule__SystemPart__Group__0 )
            // InternalDependency.g:144:4: rule__SystemPart__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SystemPart__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemPartAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystemPart"


    // $ANTLR start "entryRuleType"
    // InternalDependency.g:153:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalDependency.g:154:1: ( ruleType EOF )
            // InternalDependency.g:155:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalDependency.g:162:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:166:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalDependency.g:167:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalDependency.g:167:2: ( ( rule__Type__Group__0 ) )
            // InternalDependency.g:168:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalDependency.g:169:3: ( rule__Type__Group__0 )
            // InternalDependency.g:169:4: rule__Type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleStructureElement"
    // InternalDependency.g:178:1: entryRuleStructureElement : ruleStructureElement EOF ;
    public final void entryRuleStructureElement() throws RecognitionException {
        try {
            // InternalDependency.g:179:1: ( ruleStructureElement EOF )
            // InternalDependency.g:180:1: ruleStructureElement EOF
            {
             before(grammarAccess.getStructureElementRule()); 
            pushFollow(FOLLOW_1);
            ruleStructureElement();

            state._fsp--;

             after(grammarAccess.getStructureElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStructureElement"


    // $ANTLR start "ruleStructureElement"
    // InternalDependency.g:187:1: ruleStructureElement : ( ( rule__StructureElement__NameAssignment ) ) ;
    public final void ruleStructureElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:191:2: ( ( ( rule__StructureElement__NameAssignment ) ) )
            // InternalDependency.g:192:2: ( ( rule__StructureElement__NameAssignment ) )
            {
            // InternalDependency.g:192:2: ( ( rule__StructureElement__NameAssignment ) )
            // InternalDependency.g:193:3: ( rule__StructureElement__NameAssignment )
            {
             before(grammarAccess.getStructureElementAccess().getNameAssignment()); 
            // InternalDependency.g:194:3: ( rule__StructureElement__NameAssignment )
            // InternalDependency.g:194:4: rule__StructureElement__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StructureElement__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStructureElementAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStructureElement"


    // $ANTLR start "entryRuleProperty"
    // InternalDependency.g:203:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalDependency.g:204:1: ( ruleProperty EOF )
            // InternalDependency.g:205:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalDependency.g:212:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:216:2: ( ( ( rule__Property__Group__0 ) ) )
            // InternalDependency.g:217:2: ( ( rule__Property__Group__0 ) )
            {
            // InternalDependency.g:217:2: ( ( rule__Property__Group__0 ) )
            // InternalDependency.g:218:3: ( rule__Property__Group__0 )
            {
             before(grammarAccess.getPropertyAccess().getGroup()); 
            // InternalDependency.g:219:3: ( rule__Property__Group__0 )
            // InternalDependency.g:219:4: rule__Property__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleDescription"
    // InternalDependency.g:228:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // InternalDependency.g:229:1: ( ruleDescription EOF )
            // InternalDependency.g:230:1: ruleDescription EOF
            {
             before(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getDescriptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalDependency.g:237:1: ruleDescription : ( ( rule__Description__Group__0 ) ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:241:2: ( ( ( rule__Description__Group__0 ) ) )
            // InternalDependency.g:242:2: ( ( rule__Description__Group__0 ) )
            {
            // InternalDependency.g:242:2: ( ( rule__Description__Group__0 ) )
            // InternalDependency.g:243:3: ( rule__Description__Group__0 )
            {
             before(grammarAccess.getDescriptionAccess().getGroup()); 
            // InternalDependency.g:244:3: ( rule__Description__Group__0 )
            // InternalDependency.g:244:4: rule__Description__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Description__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRulePropertyValue"
    // InternalDependency.g:253:1: entryRulePropertyValue : rulePropertyValue EOF ;
    public final void entryRulePropertyValue() throws RecognitionException {
        try {
            // InternalDependency.g:254:1: ( rulePropertyValue EOF )
            // InternalDependency.g:255:1: rulePropertyValue EOF
            {
             before(grammarAccess.getPropertyValueRule()); 
            pushFollow(FOLLOW_1);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getPropertyValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyValue"


    // $ANTLR start "rulePropertyValue"
    // InternalDependency.g:262:1: rulePropertyValue : ( ( rule__PropertyValue__NameAssignment ) ) ;
    public final void rulePropertyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:266:2: ( ( ( rule__PropertyValue__NameAssignment ) ) )
            // InternalDependency.g:267:2: ( ( rule__PropertyValue__NameAssignment ) )
            {
            // InternalDependency.g:267:2: ( ( rule__PropertyValue__NameAssignment ) )
            // InternalDependency.g:268:3: ( rule__PropertyValue__NameAssignment )
            {
             before(grammarAccess.getPropertyValueAccess().getNameAssignment()); 
            // InternalDependency.g:269:3: ( rule__PropertyValue__NameAssignment )
            // InternalDependency.g:269:4: rule__PropertyValue__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValue__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPropertyValueAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyValue"


    // $ANTLR start "ruleComparismOperator"
    // InternalDependency.g:278:1: ruleComparismOperator : ( ( rule__ComparismOperator__Alternatives ) ) ;
    public final void ruleComparismOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:282:1: ( ( ( rule__ComparismOperator__Alternatives ) ) )
            // InternalDependency.g:283:2: ( ( rule__ComparismOperator__Alternatives ) )
            {
            // InternalDependency.g:283:2: ( ( rule__ComparismOperator__Alternatives ) )
            // InternalDependency.g:284:3: ( rule__ComparismOperator__Alternatives )
            {
             before(grammarAccess.getComparismOperatorAccess().getAlternatives()); 
            // InternalDependency.g:285:3: ( rule__ComparismOperator__Alternatives )
            // InternalDependency.g:285:4: rule__ComparismOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComparismOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparismOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparismOperator"


    // $ANTLR start "rule__Dependency__Alternatives"
    // InternalDependency.g:293:1: rule__Dependency__Alternatives : ( ( ( rule__Dependency__FlatDependencyAssignment_0 ) ) | ( ( ( rule__Dependency__HierarchicalDependenciesAssignment_1 ) ) ( ( rule__Dependency__HierarchicalDependenciesAssignment_1 )* ) ) );
    public final void rule__Dependency__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:297:1: ( ( ( rule__Dependency__FlatDependencyAssignment_0 ) ) | ( ( ( rule__Dependency__HierarchicalDependenciesAssignment_1 ) ) ( ( rule__Dependency__HierarchicalDependenciesAssignment_1 )* ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDependency.g:298:2: ( ( rule__Dependency__FlatDependencyAssignment_0 ) )
                    {
                    // InternalDependency.g:298:2: ( ( rule__Dependency__FlatDependencyAssignment_0 ) )
                    // InternalDependency.g:299:3: ( rule__Dependency__FlatDependencyAssignment_0 )
                    {
                     before(grammarAccess.getDependencyAccess().getFlatDependencyAssignment_0()); 
                    // InternalDependency.g:300:3: ( rule__Dependency__FlatDependencyAssignment_0 )
                    // InternalDependency.g:300:4: rule__Dependency__FlatDependencyAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Dependency__FlatDependencyAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDependencyAccess().getFlatDependencyAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDependency.g:304:2: ( ( ( rule__Dependency__HierarchicalDependenciesAssignment_1 ) ) ( ( rule__Dependency__HierarchicalDependenciesAssignment_1 )* ) )
                    {
                    // InternalDependency.g:304:2: ( ( ( rule__Dependency__HierarchicalDependenciesAssignment_1 ) ) ( ( rule__Dependency__HierarchicalDependenciesAssignment_1 )* ) )
                    // InternalDependency.g:305:3: ( ( rule__Dependency__HierarchicalDependenciesAssignment_1 ) ) ( ( rule__Dependency__HierarchicalDependenciesAssignment_1 )* )
                    {
                    // InternalDependency.g:305:3: ( ( rule__Dependency__HierarchicalDependenciesAssignment_1 ) )
                    // InternalDependency.g:306:4: ( rule__Dependency__HierarchicalDependenciesAssignment_1 )
                    {
                     before(grammarAccess.getDependencyAccess().getHierarchicalDependenciesAssignment_1()); 
                    // InternalDependency.g:307:4: ( rule__Dependency__HierarchicalDependenciesAssignment_1 )
                    // InternalDependency.g:307:5: rule__Dependency__HierarchicalDependenciesAssignment_1
                    {
                    pushFollow(FOLLOW_3);
                    rule__Dependency__HierarchicalDependenciesAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDependencyAccess().getHierarchicalDependenciesAssignment_1()); 

                    }

                    // InternalDependency.g:310:3: ( ( rule__Dependency__HierarchicalDependenciesAssignment_1 )* )
                    // InternalDependency.g:311:4: ( rule__Dependency__HierarchicalDependenciesAssignment_1 )*
                    {
                     before(grammarAccess.getDependencyAccess().getHierarchicalDependenciesAssignment_1()); 
                    // InternalDependency.g:312:4: ( rule__Dependency__HierarchicalDependenciesAssignment_1 )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==17) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalDependency.g:312:5: rule__Dependency__HierarchicalDependenciesAssignment_1
                    	    {
                    	    pushFollow(FOLLOW_3);
                    	    rule__Dependency__HierarchicalDependenciesAssignment_1();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                     after(grammarAccess.getDependencyAccess().getHierarchicalDependenciesAssignment_1()); 

                    }


                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Alternatives"


    // $ANTLR start "rule__ComparismOperator__Alternatives"
    // InternalDependency.g:321:1: rule__ComparismOperator__Alternatives : ( ( ( '=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '=>' ) ) | ( ( '<=' ) ) );
    public final void rule__ComparismOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:325:1: ( ( ( '=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '=>' ) ) | ( ( '<=' ) ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDependency.g:326:2: ( ( '=' ) )
                    {
                    // InternalDependency.g:326:2: ( ( '=' ) )
                    // InternalDependency.g:327:3: ( '=' )
                    {
                     before(grammarAccess.getComparismOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    // InternalDependency.g:328:3: ( '=' )
                    // InternalDependency.g:328:4: '='
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparismOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDependency.g:332:2: ( ( '>' ) )
                    {
                    // InternalDependency.g:332:2: ( ( '>' ) )
                    // InternalDependency.g:333:3: ( '>' )
                    {
                     before(grammarAccess.getComparismOperatorAccess().getGREATEREnumLiteralDeclaration_1()); 
                    // InternalDependency.g:334:3: ( '>' )
                    // InternalDependency.g:334:4: '>'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparismOperatorAccess().getGREATEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDependency.g:338:2: ( ( '<' ) )
                    {
                    // InternalDependency.g:338:2: ( ( '<' ) )
                    // InternalDependency.g:339:3: ( '<' )
                    {
                     before(grammarAccess.getComparismOperatorAccess().getLESSEnumLiteralDeclaration_2()); 
                    // InternalDependency.g:340:3: ( '<' )
                    // InternalDependency.g:340:4: '<'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparismOperatorAccess().getLESSEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDependency.g:344:2: ( ( '=>' ) )
                    {
                    // InternalDependency.g:344:2: ( ( '=>' ) )
                    // InternalDependency.g:345:3: ( '=>' )
                    {
                     before(grammarAccess.getComparismOperatorAccess().getGREATEREQUALEnumLiteralDeclaration_3()); 
                    // InternalDependency.g:346:3: ( '=>' )
                    // InternalDependency.g:346:4: '=>'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparismOperatorAccess().getGREATEREQUALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDependency.g:350:2: ( ( '<=' ) )
                    {
                    // InternalDependency.g:350:2: ( ( '<=' ) )
                    // InternalDependency.g:351:3: ( '<=' )
                    {
                     before(grammarAccess.getComparismOperatorAccess().getLESSEQUALEnumLiteralDeclaration_4()); 
                    // InternalDependency.g:352:3: ( '<=' )
                    // InternalDependency.g:352:4: '<='
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparismOperatorAccess().getLESSEQUALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparismOperator__Alternatives"


    // $ANTLR start "rule__FlatDependency__Group__0"
    // InternalDependency.g:360:1: rule__FlatDependency__Group__0 : rule__FlatDependency__Group__0__Impl rule__FlatDependency__Group__1 ;
    public final void rule__FlatDependency__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:364:1: ( rule__FlatDependency__Group__0__Impl rule__FlatDependency__Group__1 )
            // InternalDependency.g:365:2: rule__FlatDependency__Group__0__Impl rule__FlatDependency__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__FlatDependency__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FlatDependency__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlatDependency__Group__0"


    // $ANTLR start "rule__FlatDependency__Group__0__Impl"
    // InternalDependency.g:372:1: rule__FlatDependency__Group__0__Impl : ( '[FlatDependency]' ) ;
    public final void rule__FlatDependency__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:376:1: ( ( '[FlatDependency]' ) )
            // InternalDependency.g:377:1: ( '[FlatDependency]' )
            {
            // InternalDependency.g:377:1: ( '[FlatDependency]' )
            // InternalDependency.g:378:2: '[FlatDependency]'
            {
             before(grammarAccess.getFlatDependencyAccess().getFlatDependencyKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFlatDependencyAccess().getFlatDependencyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlatDependency__Group__0__Impl"


    // $ANTLR start "rule__FlatDependency__Group__1"
    // InternalDependency.g:387:1: rule__FlatDependency__Group__1 : rule__FlatDependency__Group__1__Impl rule__FlatDependency__Group__2 ;
    public final void rule__FlatDependency__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:391:1: ( rule__FlatDependency__Group__1__Impl rule__FlatDependency__Group__2 )
            // InternalDependency.g:392:2: rule__FlatDependency__Group__1__Impl rule__FlatDependency__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__FlatDependency__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FlatDependency__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlatDependency__Group__1"


    // $ANTLR start "rule__FlatDependency__Group__1__Impl"
    // InternalDependency.g:399:1: rule__FlatDependency__Group__1__Impl : ( ( rule__FlatDependency__SystemPartAssignment_1 ) ) ;
    public final void rule__FlatDependency__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:403:1: ( ( ( rule__FlatDependency__SystemPartAssignment_1 ) ) )
            // InternalDependency.g:404:1: ( ( rule__FlatDependency__SystemPartAssignment_1 ) )
            {
            // InternalDependency.g:404:1: ( ( rule__FlatDependency__SystemPartAssignment_1 ) )
            // InternalDependency.g:405:2: ( rule__FlatDependency__SystemPartAssignment_1 )
            {
             before(grammarAccess.getFlatDependencyAccess().getSystemPartAssignment_1()); 
            // InternalDependency.g:406:2: ( rule__FlatDependency__SystemPartAssignment_1 )
            // InternalDependency.g:406:3: rule__FlatDependency__SystemPartAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FlatDependency__SystemPartAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFlatDependencyAccess().getSystemPartAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlatDependency__Group__1__Impl"


    // $ANTLR start "rule__FlatDependency__Group__2"
    // InternalDependency.g:414:1: rule__FlatDependency__Group__2 : rule__FlatDependency__Group__2__Impl ;
    public final void rule__FlatDependency__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:418:1: ( rule__FlatDependency__Group__2__Impl )
            // InternalDependency.g:419:2: rule__FlatDependency__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FlatDependency__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlatDependency__Group__2"


    // $ANTLR start "rule__FlatDependency__Group__2__Impl"
    // InternalDependency.g:425:1: rule__FlatDependency__Group__2__Impl : ( ( rule__FlatDependency__TypeAssignment_2 ) ) ;
    public final void rule__FlatDependency__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:429:1: ( ( ( rule__FlatDependency__TypeAssignment_2 ) ) )
            // InternalDependency.g:430:1: ( ( rule__FlatDependency__TypeAssignment_2 ) )
            {
            // InternalDependency.g:430:1: ( ( rule__FlatDependency__TypeAssignment_2 ) )
            // InternalDependency.g:431:2: ( rule__FlatDependency__TypeAssignment_2 )
            {
             before(grammarAccess.getFlatDependencyAccess().getTypeAssignment_2()); 
            // InternalDependency.g:432:2: ( rule__FlatDependency__TypeAssignment_2 )
            // InternalDependency.g:432:3: rule__FlatDependency__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FlatDependency__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFlatDependencyAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlatDependency__Group__2__Impl"


    // $ANTLR start "rule__HierarchicalDependency__Group__0"
    // InternalDependency.g:441:1: rule__HierarchicalDependency__Group__0 : rule__HierarchicalDependency__Group__0__Impl rule__HierarchicalDependency__Group__1 ;
    public final void rule__HierarchicalDependency__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:445:1: ( rule__HierarchicalDependency__Group__0__Impl rule__HierarchicalDependency__Group__1 )
            // InternalDependency.g:446:2: rule__HierarchicalDependency__Group__0__Impl rule__HierarchicalDependency__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__HierarchicalDependency__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HierarchicalDependency__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HierarchicalDependency__Group__0"


    // $ANTLR start "rule__HierarchicalDependency__Group__0__Impl"
    // InternalDependency.g:453:1: rule__HierarchicalDependency__Group__0__Impl : ( '[HierarchicalDependency]' ) ;
    public final void rule__HierarchicalDependency__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:457:1: ( ( '[HierarchicalDependency]' ) )
            // InternalDependency.g:458:1: ( '[HierarchicalDependency]' )
            {
            // InternalDependency.g:458:1: ( '[HierarchicalDependency]' )
            // InternalDependency.g:459:2: '[HierarchicalDependency]'
            {
             before(grammarAccess.getHierarchicalDependencyAccess().getHierarchicalDependencyKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getHierarchicalDependencyAccess().getHierarchicalDependencyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HierarchicalDependency__Group__0__Impl"


    // $ANTLR start "rule__HierarchicalDependency__Group__1"
    // InternalDependency.g:468:1: rule__HierarchicalDependency__Group__1 : rule__HierarchicalDependency__Group__1__Impl rule__HierarchicalDependency__Group__2 ;
    public final void rule__HierarchicalDependency__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:472:1: ( rule__HierarchicalDependency__Group__1__Impl rule__HierarchicalDependency__Group__2 )
            // InternalDependency.g:473:2: rule__HierarchicalDependency__Group__1__Impl rule__HierarchicalDependency__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__HierarchicalDependency__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HierarchicalDependency__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HierarchicalDependency__Group__1"


    // $ANTLR start "rule__HierarchicalDependency__Group__1__Impl"
    // InternalDependency.g:480:1: rule__HierarchicalDependency__Group__1__Impl : ( ( '(Exclusive)' )? ) ;
    public final void rule__HierarchicalDependency__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:484:1: ( ( ( '(Exclusive)' )? ) )
            // InternalDependency.g:485:1: ( ( '(Exclusive)' )? )
            {
            // InternalDependency.g:485:1: ( ( '(Exclusive)' )? )
            // InternalDependency.g:486:2: ( '(Exclusive)' )?
            {
             before(grammarAccess.getHierarchicalDependencyAccess().getExclusiveKeyword_1()); 
            // InternalDependency.g:487:2: ( '(Exclusive)' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDependency.g:487:3: '(Exclusive)'
                    {
                    match(input,18,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getHierarchicalDependencyAccess().getExclusiveKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HierarchicalDependency__Group__1__Impl"


    // $ANTLR start "rule__HierarchicalDependency__Group__2"
    // InternalDependency.g:495:1: rule__HierarchicalDependency__Group__2 : rule__HierarchicalDependency__Group__2__Impl rule__HierarchicalDependency__Group__3 ;
    public final void rule__HierarchicalDependency__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:499:1: ( rule__HierarchicalDependency__Group__2__Impl rule__HierarchicalDependency__Group__3 )
            // InternalDependency.g:500:2: rule__HierarchicalDependency__Group__2__Impl rule__HierarchicalDependency__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__HierarchicalDependency__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HierarchicalDependency__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HierarchicalDependency__Group__2"


    // $ANTLR start "rule__HierarchicalDependency__Group__2__Impl"
    // InternalDependency.g:507:1: rule__HierarchicalDependency__Group__2__Impl : ( ( rule__HierarchicalDependency__SystemPartAssignment_2 ) ) ;
    public final void rule__HierarchicalDependency__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:511:1: ( ( ( rule__HierarchicalDependency__SystemPartAssignment_2 ) ) )
            // InternalDependency.g:512:1: ( ( rule__HierarchicalDependency__SystemPartAssignment_2 ) )
            {
            // InternalDependency.g:512:1: ( ( rule__HierarchicalDependency__SystemPartAssignment_2 ) )
            // InternalDependency.g:513:2: ( rule__HierarchicalDependency__SystemPartAssignment_2 )
            {
             before(grammarAccess.getHierarchicalDependencyAccess().getSystemPartAssignment_2()); 
            // InternalDependency.g:514:2: ( rule__HierarchicalDependency__SystemPartAssignment_2 )
            // InternalDependency.g:514:3: rule__HierarchicalDependency__SystemPartAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__HierarchicalDependency__SystemPartAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHierarchicalDependencyAccess().getSystemPartAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HierarchicalDependency__Group__2__Impl"


    // $ANTLR start "rule__HierarchicalDependency__Group__3"
    // InternalDependency.g:522:1: rule__HierarchicalDependency__Group__3 : rule__HierarchicalDependency__Group__3__Impl rule__HierarchicalDependency__Group__4 ;
    public final void rule__HierarchicalDependency__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:526:1: ( rule__HierarchicalDependency__Group__3__Impl rule__HierarchicalDependency__Group__4 )
            // InternalDependency.g:527:2: rule__HierarchicalDependency__Group__3__Impl rule__HierarchicalDependency__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__HierarchicalDependency__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HierarchicalDependency__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HierarchicalDependency__Group__3"


    // $ANTLR start "rule__HierarchicalDependency__Group__3__Impl"
    // InternalDependency.g:534:1: rule__HierarchicalDependency__Group__3__Impl : ( 'StructureElements:' ) ;
    public final void rule__HierarchicalDependency__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:538:1: ( ( 'StructureElements:' ) )
            // InternalDependency.g:539:1: ( 'StructureElements:' )
            {
            // InternalDependency.g:539:1: ( 'StructureElements:' )
            // InternalDependency.g:540:2: 'StructureElements:'
            {
             before(grammarAccess.getHierarchicalDependencyAccess().getStructureElementsKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getHierarchicalDependencyAccess().getStructureElementsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HierarchicalDependency__Group__3__Impl"


    // $ANTLR start "rule__HierarchicalDependency__Group__4"
    // InternalDependency.g:549:1: rule__HierarchicalDependency__Group__4 : rule__HierarchicalDependency__Group__4__Impl rule__HierarchicalDependency__Group__5 ;
    public final void rule__HierarchicalDependency__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:553:1: ( rule__HierarchicalDependency__Group__4__Impl rule__HierarchicalDependency__Group__5 )
            // InternalDependency.g:554:2: rule__HierarchicalDependency__Group__4__Impl rule__HierarchicalDependency__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__HierarchicalDependency__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HierarchicalDependency__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HierarchicalDependency__Group__4"


    // $ANTLR start "rule__HierarchicalDependency__Group__4__Impl"
    // InternalDependency.g:561:1: rule__HierarchicalDependency__Group__4__Impl : ( ( ( rule__HierarchicalDependency__StructureElementsAssignment_4 ) ) ( ( rule__HierarchicalDependency__StructureElementsAssignment_4 )* ) ) ;
    public final void rule__HierarchicalDependency__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:565:1: ( ( ( ( rule__HierarchicalDependency__StructureElementsAssignment_4 ) ) ( ( rule__HierarchicalDependency__StructureElementsAssignment_4 )* ) ) )
            // InternalDependency.g:566:1: ( ( ( rule__HierarchicalDependency__StructureElementsAssignment_4 ) ) ( ( rule__HierarchicalDependency__StructureElementsAssignment_4 )* ) )
            {
            // InternalDependency.g:566:1: ( ( ( rule__HierarchicalDependency__StructureElementsAssignment_4 ) ) ( ( rule__HierarchicalDependency__StructureElementsAssignment_4 )* ) )
            // InternalDependency.g:567:2: ( ( rule__HierarchicalDependency__StructureElementsAssignment_4 ) ) ( ( rule__HierarchicalDependency__StructureElementsAssignment_4 )* )
            {
            // InternalDependency.g:567:2: ( ( rule__HierarchicalDependency__StructureElementsAssignment_4 ) )
            // InternalDependency.g:568:3: ( rule__HierarchicalDependency__StructureElementsAssignment_4 )
            {
             before(grammarAccess.getHierarchicalDependencyAccess().getStructureElementsAssignment_4()); 
            // InternalDependency.g:569:3: ( rule__HierarchicalDependency__StructureElementsAssignment_4 )
            // InternalDependency.g:569:4: rule__HierarchicalDependency__StructureElementsAssignment_4
            {
            pushFollow(FOLLOW_10);
            rule__HierarchicalDependency__StructureElementsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getHierarchicalDependencyAccess().getStructureElementsAssignment_4()); 

            }

            // InternalDependency.g:572:2: ( ( rule__HierarchicalDependency__StructureElementsAssignment_4 )* )
            // InternalDependency.g:573:3: ( rule__HierarchicalDependency__StructureElementsAssignment_4 )*
            {
             before(grammarAccess.getHierarchicalDependencyAccess().getStructureElementsAssignment_4()); 
            // InternalDependency.g:574:3: ( rule__HierarchicalDependency__StructureElementsAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDependency.g:574:4: rule__HierarchicalDependency__StructureElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__HierarchicalDependency__StructureElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getHierarchicalDependencyAccess().getStructureElementsAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HierarchicalDependency__Group__4__Impl"


    // $ANTLR start "rule__HierarchicalDependency__Group__5"
    // InternalDependency.g:583:1: rule__HierarchicalDependency__Group__5 : rule__HierarchicalDependency__Group__5__Impl rule__HierarchicalDependency__Group__6 ;
    public final void rule__HierarchicalDependency__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:587:1: ( rule__HierarchicalDependency__Group__5__Impl rule__HierarchicalDependency__Group__6 )
            // InternalDependency.g:588:2: rule__HierarchicalDependency__Group__5__Impl rule__HierarchicalDependency__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__HierarchicalDependency__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HierarchicalDependency__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HierarchicalDependency__Group__5"


    // $ANTLR start "rule__HierarchicalDependency__Group__5__Impl"
    // InternalDependency.g:595:1: rule__HierarchicalDependency__Group__5__Impl : ( 'Properties:' ) ;
    public final void rule__HierarchicalDependency__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:599:1: ( ( 'Properties:' ) )
            // InternalDependency.g:600:1: ( 'Properties:' )
            {
            // InternalDependency.g:600:1: ( 'Properties:' )
            // InternalDependency.g:601:2: 'Properties:'
            {
             before(grammarAccess.getHierarchicalDependencyAccess().getPropertiesKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getHierarchicalDependencyAccess().getPropertiesKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HierarchicalDependency__Group__5__Impl"


    // $ANTLR start "rule__HierarchicalDependency__Group__6"
    // InternalDependency.g:610:1: rule__HierarchicalDependency__Group__6 : rule__HierarchicalDependency__Group__6__Impl ;
    public final void rule__HierarchicalDependency__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:614:1: ( rule__HierarchicalDependency__Group__6__Impl )
            // InternalDependency.g:615:2: rule__HierarchicalDependency__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HierarchicalDependency__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HierarchicalDependency__Group__6"


    // $ANTLR start "rule__HierarchicalDependency__Group__6__Impl"
    // InternalDependency.g:621:1: rule__HierarchicalDependency__Group__6__Impl : ( ( ( rule__HierarchicalDependency__PropertiesAssignment_6 ) ) ( ( rule__HierarchicalDependency__PropertiesAssignment_6 )* ) ) ;
    public final void rule__HierarchicalDependency__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:625:1: ( ( ( ( rule__HierarchicalDependency__PropertiesAssignment_6 ) ) ( ( rule__HierarchicalDependency__PropertiesAssignment_6 )* ) ) )
            // InternalDependency.g:626:1: ( ( ( rule__HierarchicalDependency__PropertiesAssignment_6 ) ) ( ( rule__HierarchicalDependency__PropertiesAssignment_6 )* ) )
            {
            // InternalDependency.g:626:1: ( ( ( rule__HierarchicalDependency__PropertiesAssignment_6 ) ) ( ( rule__HierarchicalDependency__PropertiesAssignment_6 )* ) )
            // InternalDependency.g:627:2: ( ( rule__HierarchicalDependency__PropertiesAssignment_6 ) ) ( ( rule__HierarchicalDependency__PropertiesAssignment_6 )* )
            {
            // InternalDependency.g:627:2: ( ( rule__HierarchicalDependency__PropertiesAssignment_6 ) )
            // InternalDependency.g:628:3: ( rule__HierarchicalDependency__PropertiesAssignment_6 )
            {
             before(grammarAccess.getHierarchicalDependencyAccess().getPropertiesAssignment_6()); 
            // InternalDependency.g:629:3: ( rule__HierarchicalDependency__PropertiesAssignment_6 )
            // InternalDependency.g:629:4: rule__HierarchicalDependency__PropertiesAssignment_6
            {
            pushFollow(FOLLOW_12);
            rule__HierarchicalDependency__PropertiesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getHierarchicalDependencyAccess().getPropertiesAssignment_6()); 

            }

            // InternalDependency.g:632:2: ( ( rule__HierarchicalDependency__PropertiesAssignment_6 )* )
            // InternalDependency.g:633:3: ( rule__HierarchicalDependency__PropertiesAssignment_6 )*
            {
             before(grammarAccess.getHierarchicalDependencyAccess().getPropertiesAssignment_6()); 
            // InternalDependency.g:634:3: ( rule__HierarchicalDependency__PropertiesAssignment_6 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDependency.g:634:4: rule__HierarchicalDependency__PropertiesAssignment_6
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__HierarchicalDependency__PropertiesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getHierarchicalDependencyAccess().getPropertiesAssignment_6()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HierarchicalDependency__Group__6__Impl"


    // $ANTLR start "rule__SystemPart__Group__0"
    // InternalDependency.g:644:1: rule__SystemPart__Group__0 : rule__SystemPart__Group__0__Impl rule__SystemPart__Group__1 ;
    public final void rule__SystemPart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:648:1: ( rule__SystemPart__Group__0__Impl rule__SystemPart__Group__1 )
            // InternalDependency.g:649:2: rule__SystemPart__Group__0__Impl rule__SystemPart__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__SystemPart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemPart__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemPart__Group__0"


    // $ANTLR start "rule__SystemPart__Group__0__Impl"
    // InternalDependency.g:656:1: rule__SystemPart__Group__0__Impl : ( 'SystemPart:' ) ;
    public final void rule__SystemPart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:660:1: ( ( 'SystemPart:' ) )
            // InternalDependency.g:661:1: ( 'SystemPart:' )
            {
            // InternalDependency.g:661:1: ( 'SystemPart:' )
            // InternalDependency.g:662:2: 'SystemPart:'
            {
             before(grammarAccess.getSystemPartAccess().getSystemPartKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSystemPartAccess().getSystemPartKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemPart__Group__0__Impl"


    // $ANTLR start "rule__SystemPart__Group__1"
    // InternalDependency.g:671:1: rule__SystemPart__Group__1 : rule__SystemPart__Group__1__Impl ;
    public final void rule__SystemPart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:675:1: ( rule__SystemPart__Group__1__Impl )
            // InternalDependency.g:676:2: rule__SystemPart__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemPart__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemPart__Group__1"


    // $ANTLR start "rule__SystemPart__Group__1__Impl"
    // InternalDependency.g:682:1: rule__SystemPart__Group__1__Impl : ( ( rule__SystemPart__NameAssignment_1 ) ) ;
    public final void rule__SystemPart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:686:1: ( ( ( rule__SystemPart__NameAssignment_1 ) ) )
            // InternalDependency.g:687:1: ( ( rule__SystemPart__NameAssignment_1 ) )
            {
            // InternalDependency.g:687:1: ( ( rule__SystemPart__NameAssignment_1 ) )
            // InternalDependency.g:688:2: ( rule__SystemPart__NameAssignment_1 )
            {
             before(grammarAccess.getSystemPartAccess().getNameAssignment_1()); 
            // InternalDependency.g:689:2: ( rule__SystemPart__NameAssignment_1 )
            // InternalDependency.g:689:3: rule__SystemPart__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SystemPart__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemPartAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemPart__Group__1__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // InternalDependency.g:698:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:702:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalDependency.g:703:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // InternalDependency.g:710:1: rule__Type__Group__0__Impl : ( 'Type:' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:714:1: ( ( 'Type:' ) )
            // InternalDependency.g:715:1: ( 'Type:' )
            {
            // InternalDependency.g:715:1: ( 'Type:' )
            // InternalDependency.g:716:2: 'Type:'
            {
             before(grammarAccess.getTypeAccess().getTypeKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // InternalDependency.g:725:1: rule__Type__Group__1 : rule__Type__Group__1__Impl ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:729:1: ( rule__Type__Group__1__Impl )
            // InternalDependency.g:730:2: rule__Type__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // InternalDependency.g:736:1: rule__Type__Group__1__Impl : ( ( rule__Type__TypeAssignment_1 ) ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:740:1: ( ( ( rule__Type__TypeAssignment_1 ) ) )
            // InternalDependency.g:741:1: ( ( rule__Type__TypeAssignment_1 ) )
            {
            // InternalDependency.g:741:1: ( ( rule__Type__TypeAssignment_1 ) )
            // InternalDependency.g:742:2: ( rule__Type__TypeAssignment_1 )
            {
             before(grammarAccess.getTypeAccess().getTypeAssignment_1()); 
            // InternalDependency.g:743:2: ( rule__Type__TypeAssignment_1 )
            // InternalDependency.g:743:3: rule__Type__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Type__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__0"
    // InternalDependency.g:752:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:756:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalDependency.g:757:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Property__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0"


    // $ANTLR start "rule__Property__Group__0__Impl"
    // InternalDependency.g:764:1: rule__Property__Group__0__Impl : ( '(' ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:768:1: ( ( '(' ) )
            // InternalDependency.g:769:1: ( '(' )
            {
            // InternalDependency.g:769:1: ( '(' )
            // InternalDependency.g:770:2: '('
            {
             before(grammarAccess.getPropertyAccess().getLeftParenthesisKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__0__Impl"


    // $ANTLR start "rule__Property__Group__1"
    // InternalDependency.g:779:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:783:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // InternalDependency.g:784:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Property__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1"


    // $ANTLR start "rule__Property__Group__1__Impl"
    // InternalDependency.g:791:1: rule__Property__Group__1__Impl : ( ( rule__Property__NameAssignment_1 ) ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:795:1: ( ( ( rule__Property__NameAssignment_1 ) ) )
            // InternalDependency.g:796:1: ( ( rule__Property__NameAssignment_1 ) )
            {
            // InternalDependency.g:796:1: ( ( rule__Property__NameAssignment_1 ) )
            // InternalDependency.g:797:2: ( rule__Property__NameAssignment_1 )
            {
             before(grammarAccess.getPropertyAccess().getNameAssignment_1()); 
            // InternalDependency.g:798:2: ( rule__Property__NameAssignment_1 )
            // InternalDependency.g:798:3: rule__Property__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Property__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__1__Impl"


    // $ANTLR start "rule__Property__Group__2"
    // InternalDependency.g:806:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:810:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // InternalDependency.g:811:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Property__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2"


    // $ANTLR start "rule__Property__Group__2__Impl"
    // InternalDependency.g:818:1: rule__Property__Group__2__Impl : ( ( rule__Property__ComparismOperatorAssignment_2 ) ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:822:1: ( ( ( rule__Property__ComparismOperatorAssignment_2 ) ) )
            // InternalDependency.g:823:1: ( ( rule__Property__ComparismOperatorAssignment_2 ) )
            {
            // InternalDependency.g:823:1: ( ( rule__Property__ComparismOperatorAssignment_2 ) )
            // InternalDependency.g:824:2: ( rule__Property__ComparismOperatorAssignment_2 )
            {
             before(grammarAccess.getPropertyAccess().getComparismOperatorAssignment_2()); 
            // InternalDependency.g:825:2: ( rule__Property__ComparismOperatorAssignment_2 )
            // InternalDependency.g:825:3: rule__Property__ComparismOperatorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Property__ComparismOperatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getComparismOperatorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__2__Impl"


    // $ANTLR start "rule__Property__Group__3"
    // InternalDependency.g:833:1: rule__Property__Group__3 : rule__Property__Group__3__Impl rule__Property__Group__4 ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:837:1: ( rule__Property__Group__3__Impl rule__Property__Group__4 )
            // InternalDependency.g:838:2: rule__Property__Group__3__Impl rule__Property__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Property__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__3"


    // $ANTLR start "rule__Property__Group__3__Impl"
    // InternalDependency.g:845:1: rule__Property__Group__3__Impl : ( ( rule__Property__ValueAssignment_3 ) ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:849:1: ( ( ( rule__Property__ValueAssignment_3 ) ) )
            // InternalDependency.g:850:1: ( ( rule__Property__ValueAssignment_3 ) )
            {
            // InternalDependency.g:850:1: ( ( rule__Property__ValueAssignment_3 ) )
            // InternalDependency.g:851:2: ( rule__Property__ValueAssignment_3 )
            {
             before(grammarAccess.getPropertyAccess().getValueAssignment_3()); 
            // InternalDependency.g:852:2: ( rule__Property__ValueAssignment_3 )
            // InternalDependency.g:852:3: rule__Property__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Property__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__3__Impl"


    // $ANTLR start "rule__Property__Group__4"
    // InternalDependency.g:860:1: rule__Property__Group__4 : rule__Property__Group__4__Impl rule__Property__Group__5 ;
    public final void rule__Property__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:864:1: ( rule__Property__Group__4__Impl rule__Property__Group__5 )
            // InternalDependency.g:865:2: rule__Property__Group__4__Impl rule__Property__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Property__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Property__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__4"


    // $ANTLR start "rule__Property__Group__4__Impl"
    // InternalDependency.g:872:1: rule__Property__Group__4__Impl : ( ( rule__Property__DescriptionAssignment_4 )? ) ;
    public final void rule__Property__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:876:1: ( ( ( rule__Property__DescriptionAssignment_4 )? ) )
            // InternalDependency.g:877:1: ( ( rule__Property__DescriptionAssignment_4 )? )
            {
            // InternalDependency.g:877:1: ( ( rule__Property__DescriptionAssignment_4 )? )
            // InternalDependency.g:878:2: ( rule__Property__DescriptionAssignment_4 )?
            {
             before(grammarAccess.getPropertyAccess().getDescriptionAssignment_4()); 
            // InternalDependency.g:879:2: ( rule__Property__DescriptionAssignment_4 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDependency.g:879:3: rule__Property__DescriptionAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Property__DescriptionAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyAccess().getDescriptionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__4__Impl"


    // $ANTLR start "rule__Property__Group__5"
    // InternalDependency.g:887:1: rule__Property__Group__5 : rule__Property__Group__5__Impl ;
    public final void rule__Property__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:891:1: ( rule__Property__Group__5__Impl )
            // InternalDependency.g:892:2: rule__Property__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__5"


    // $ANTLR start "rule__Property__Group__5__Impl"
    // InternalDependency.g:898:1: rule__Property__Group__5__Impl : ( ')' ) ;
    public final void rule__Property__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:902:1: ( ( ')' ) )
            // InternalDependency.g:903:1: ( ')' )
            {
            // InternalDependency.g:903:1: ( ')' )
            // InternalDependency.g:904:2: ')'
            {
             before(grammarAccess.getPropertyAccess().getRightParenthesisKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group__5__Impl"


    // $ANTLR start "rule__Description__Group__0"
    // InternalDependency.g:914:1: rule__Description__Group__0 : rule__Description__Group__0__Impl rule__Description__Group__1 ;
    public final void rule__Description__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:918:1: ( rule__Description__Group__0__Impl rule__Description__Group__1 )
            // InternalDependency.g:919:2: rule__Description__Group__0__Impl rule__Description__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Description__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__0"


    // $ANTLR start "rule__Description__Group__0__Impl"
    // InternalDependency.g:926:1: rule__Description__Group__0__Impl : ( '(' ) ;
    public final void rule__Description__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:930:1: ( ( '(' ) )
            // InternalDependency.g:931:1: ( '(' )
            {
            // InternalDependency.g:931:1: ( '(' )
            // InternalDependency.g:932:2: '('
            {
             before(grammarAccess.getDescriptionAccess().getLeftParenthesisKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__0__Impl"


    // $ANTLR start "rule__Description__Group__1"
    // InternalDependency.g:941:1: rule__Description__Group__1 : rule__Description__Group__1__Impl rule__Description__Group__2 ;
    public final void rule__Description__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:945:1: ( rule__Description__Group__1__Impl rule__Description__Group__2 )
            // InternalDependency.g:946:2: rule__Description__Group__1__Impl rule__Description__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Description__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Description__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__1"


    // $ANTLR start "rule__Description__Group__1__Impl"
    // InternalDependency.g:953:1: rule__Description__Group__1__Impl : ( ( rule__Description__NameAssignment_1 ) ) ;
    public final void rule__Description__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:957:1: ( ( ( rule__Description__NameAssignment_1 ) ) )
            // InternalDependency.g:958:1: ( ( rule__Description__NameAssignment_1 ) )
            {
            // InternalDependency.g:958:1: ( ( rule__Description__NameAssignment_1 ) )
            // InternalDependency.g:959:2: ( rule__Description__NameAssignment_1 )
            {
             before(grammarAccess.getDescriptionAccess().getNameAssignment_1()); 
            // InternalDependency.g:960:2: ( rule__Description__NameAssignment_1 )
            // InternalDependency.g:960:3: rule__Description__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Description__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__1__Impl"


    // $ANTLR start "rule__Description__Group__2"
    // InternalDependency.g:968:1: rule__Description__Group__2 : rule__Description__Group__2__Impl ;
    public final void rule__Description__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:972:1: ( rule__Description__Group__2__Impl )
            // InternalDependency.g:973:2: rule__Description__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Description__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__2"


    // $ANTLR start "rule__Description__Group__2__Impl"
    // InternalDependency.g:979:1: rule__Description__Group__2__Impl : ( ')' ) ;
    public final void rule__Description__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:983:1: ( ( ')' ) )
            // InternalDependency.g:984:1: ( ')' )
            {
            // InternalDependency.g:984:1: ( ')' )
            // InternalDependency.g:985:2: ')'
            {
             before(grammarAccess.getDescriptionAccess().getRightParenthesisKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__Group__2__Impl"


    // $ANTLR start "rule__Dependency__FlatDependencyAssignment_0"
    // InternalDependency.g:995:1: rule__Dependency__FlatDependencyAssignment_0 : ( ruleFlatDependency ) ;
    public final void rule__Dependency__FlatDependencyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:999:1: ( ( ruleFlatDependency ) )
            // InternalDependency.g:1000:2: ( ruleFlatDependency )
            {
            // InternalDependency.g:1000:2: ( ruleFlatDependency )
            // InternalDependency.g:1001:3: ruleFlatDependency
            {
             before(grammarAccess.getDependencyAccess().getFlatDependencyFlatDependencyParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFlatDependency();

            state._fsp--;

             after(grammarAccess.getDependencyAccess().getFlatDependencyFlatDependencyParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__FlatDependencyAssignment_0"


    // $ANTLR start "rule__Dependency__HierarchicalDependenciesAssignment_1"
    // InternalDependency.g:1010:1: rule__Dependency__HierarchicalDependenciesAssignment_1 : ( ruleHierarchicalDependency ) ;
    public final void rule__Dependency__HierarchicalDependenciesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1014:1: ( ( ruleHierarchicalDependency ) )
            // InternalDependency.g:1015:2: ( ruleHierarchicalDependency )
            {
            // InternalDependency.g:1015:2: ( ruleHierarchicalDependency )
            // InternalDependency.g:1016:3: ruleHierarchicalDependency
            {
             before(grammarAccess.getDependencyAccess().getHierarchicalDependenciesHierarchicalDependencyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHierarchicalDependency();

            state._fsp--;

             after(grammarAccess.getDependencyAccess().getHierarchicalDependenciesHierarchicalDependencyParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__HierarchicalDependenciesAssignment_1"


    // $ANTLR start "rule__FlatDependency__SystemPartAssignment_1"
    // InternalDependency.g:1025:1: rule__FlatDependency__SystemPartAssignment_1 : ( ruleSystemPart ) ;
    public final void rule__FlatDependency__SystemPartAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1029:1: ( ( ruleSystemPart ) )
            // InternalDependency.g:1030:2: ( ruleSystemPart )
            {
            // InternalDependency.g:1030:2: ( ruleSystemPart )
            // InternalDependency.g:1031:3: ruleSystemPart
            {
             before(grammarAccess.getFlatDependencyAccess().getSystemPartSystemPartParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSystemPart();

            state._fsp--;

             after(grammarAccess.getFlatDependencyAccess().getSystemPartSystemPartParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlatDependency__SystemPartAssignment_1"


    // $ANTLR start "rule__FlatDependency__TypeAssignment_2"
    // InternalDependency.g:1040:1: rule__FlatDependency__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__FlatDependency__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1044:1: ( ( ruleType ) )
            // InternalDependency.g:1045:2: ( ruleType )
            {
            // InternalDependency.g:1045:2: ( ruleType )
            // InternalDependency.g:1046:3: ruleType
            {
             before(grammarAccess.getFlatDependencyAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getFlatDependencyAccess().getTypeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlatDependency__TypeAssignment_2"


    // $ANTLR start "rule__HierarchicalDependency__SystemPartAssignment_2"
    // InternalDependency.g:1055:1: rule__HierarchicalDependency__SystemPartAssignment_2 : ( ruleSystemPart ) ;
    public final void rule__HierarchicalDependency__SystemPartAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1059:1: ( ( ruleSystemPart ) )
            // InternalDependency.g:1060:2: ( ruleSystemPart )
            {
            // InternalDependency.g:1060:2: ( ruleSystemPart )
            // InternalDependency.g:1061:3: ruleSystemPart
            {
             before(grammarAccess.getHierarchicalDependencyAccess().getSystemPartSystemPartParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSystemPart();

            state._fsp--;

             after(grammarAccess.getHierarchicalDependencyAccess().getSystemPartSystemPartParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HierarchicalDependency__SystemPartAssignment_2"


    // $ANTLR start "rule__HierarchicalDependency__StructureElementsAssignment_4"
    // InternalDependency.g:1070:1: rule__HierarchicalDependency__StructureElementsAssignment_4 : ( ruleStructureElement ) ;
    public final void rule__HierarchicalDependency__StructureElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1074:1: ( ( ruleStructureElement ) )
            // InternalDependency.g:1075:2: ( ruleStructureElement )
            {
            // InternalDependency.g:1075:2: ( ruleStructureElement )
            // InternalDependency.g:1076:3: ruleStructureElement
            {
             before(grammarAccess.getHierarchicalDependencyAccess().getStructureElementsStructureElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStructureElement();

            state._fsp--;

             after(grammarAccess.getHierarchicalDependencyAccess().getStructureElementsStructureElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HierarchicalDependency__StructureElementsAssignment_4"


    // $ANTLR start "rule__HierarchicalDependency__PropertiesAssignment_6"
    // InternalDependency.g:1085:1: rule__HierarchicalDependency__PropertiesAssignment_6 : ( ruleProperty ) ;
    public final void rule__HierarchicalDependency__PropertiesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1089:1: ( ( ruleProperty ) )
            // InternalDependency.g:1090:2: ( ruleProperty )
            {
            // InternalDependency.g:1090:2: ( ruleProperty )
            // InternalDependency.g:1091:3: ruleProperty
            {
             before(grammarAccess.getHierarchicalDependencyAccess().getPropertiesPropertyParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getHierarchicalDependencyAccess().getPropertiesPropertyParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HierarchicalDependency__PropertiesAssignment_6"


    // $ANTLR start "rule__SystemPart__NameAssignment_1"
    // InternalDependency.g:1100:1: rule__SystemPart__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SystemPart__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1104:1: ( ( RULE_ID ) )
            // InternalDependency.g:1105:2: ( RULE_ID )
            {
            // InternalDependency.g:1105:2: ( RULE_ID )
            // InternalDependency.g:1106:3: RULE_ID
            {
             before(grammarAccess.getSystemPartAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemPartAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemPart__NameAssignment_1"


    // $ANTLR start "rule__Type__TypeAssignment_1"
    // InternalDependency.g:1115:1: rule__Type__TypeAssignment_1 : ( RULE_ID ) ;
    public final void rule__Type__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1119:1: ( ( RULE_ID ) )
            // InternalDependency.g:1120:2: ( RULE_ID )
            {
            // InternalDependency.g:1120:2: ( RULE_ID )
            // InternalDependency.g:1121:3: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getTypeIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTypeIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TypeAssignment_1"


    // $ANTLR start "rule__StructureElement__NameAssignment"
    // InternalDependency.g:1130:1: rule__StructureElement__NameAssignment : ( RULE_ID ) ;
    public final void rule__StructureElement__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1134:1: ( ( RULE_ID ) )
            // InternalDependency.g:1135:2: ( RULE_ID )
            {
            // InternalDependency.g:1135:2: ( RULE_ID )
            // InternalDependency.g:1136:3: RULE_ID
            {
             before(grammarAccess.getStructureElementAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStructureElementAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructureElement__NameAssignment"


    // $ANTLR start "rule__Property__NameAssignment_1"
    // InternalDependency.g:1145:1: rule__Property__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1149:1: ( ( RULE_ID ) )
            // InternalDependency.g:1150:2: ( RULE_ID )
            {
            // InternalDependency.g:1150:2: ( RULE_ID )
            // InternalDependency.g:1151:3: RULE_ID
            {
             before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__NameAssignment_1"


    // $ANTLR start "rule__Property__ComparismOperatorAssignment_2"
    // InternalDependency.g:1160:1: rule__Property__ComparismOperatorAssignment_2 : ( ruleComparismOperator ) ;
    public final void rule__Property__ComparismOperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1164:1: ( ( ruleComparismOperator ) )
            // InternalDependency.g:1165:2: ( ruleComparismOperator )
            {
            // InternalDependency.g:1165:2: ( ruleComparismOperator )
            // InternalDependency.g:1166:3: ruleComparismOperator
            {
             before(grammarAccess.getPropertyAccess().getComparismOperatorComparismOperatorEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComparismOperator();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getComparismOperatorComparismOperatorEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__ComparismOperatorAssignment_2"


    // $ANTLR start "rule__Property__ValueAssignment_3"
    // InternalDependency.g:1175:1: rule__Property__ValueAssignment_3 : ( rulePropertyValue ) ;
    public final void rule__Property__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1179:1: ( ( rulePropertyValue ) )
            // InternalDependency.g:1180:2: ( rulePropertyValue )
            {
            // InternalDependency.g:1180:2: ( rulePropertyValue )
            // InternalDependency.g:1181:3: rulePropertyValue
            {
             before(grammarAccess.getPropertyAccess().getValuePropertyValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePropertyValue();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getValuePropertyValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__ValueAssignment_3"


    // $ANTLR start "rule__Property__DescriptionAssignment_4"
    // InternalDependency.g:1190:1: rule__Property__DescriptionAssignment_4 : ( ruleDescription ) ;
    public final void rule__Property__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1194:1: ( ( ruleDescription ) )
            // InternalDependency.g:1195:2: ( ruleDescription )
            {
            // InternalDependency.g:1195:2: ( ruleDescription )
            // InternalDependency.g:1196:3: ruleDescription
            {
             before(grammarAccess.getPropertyAccess().getDescriptionDescriptionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getPropertyAccess().getDescriptionDescriptionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__DescriptionAssignment_4"


    // $ANTLR start "rule__Description__NameAssignment_1"
    // InternalDependency.g:1205:1: rule__Description__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Description__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1209:1: ( ( RULE_ID ) )
            // InternalDependency.g:1210:2: ( RULE_ID )
            {
            // InternalDependency.g:1210:2: ( RULE_ID )
            // InternalDependency.g:1211:3: RULE_ID
            {
             before(grammarAccess.getDescriptionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDescriptionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Description__NameAssignment_1"


    // $ANTLR start "rule__PropertyValue__NameAssignment"
    // InternalDependency.g:1220:1: rule__PropertyValue__NameAssignment : ( RULE_ID ) ;
    public final void rule__PropertyValue__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDependency.g:1224:1: ( ( RULE_ID ) )
            // InternalDependency.g:1225:2: ( RULE_ID )
            {
            // InternalDependency.g:1225:2: ( RULE_ID )
            // InternalDependency.g:1226:3: RULE_ID
            {
             before(grammarAccess.getPropertyValueAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPropertyValueAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});

}