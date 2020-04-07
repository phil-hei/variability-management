package org.itea2.amalthea.variability.dependency.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.itea2.amalthea.variability.dependency.services.DependencyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDependencyParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'[FlatDependency]'", "'[HierarchicalDependency]'", "'(Exclusive)'", "'StructureElements:'", "'Properties:'", "'SystemPart:'", "'Type:'", "'('", "')'", "'='", "'>'", "'<'", "'=>'", "'<='"
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

        public InternalDependencyParser(TokenStream input, DependencyGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Dependency";
       	}

       	@Override
       	protected DependencyGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDependency"
    // InternalDependency.g:65:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // InternalDependency.g:65:51: (iv_ruleDependency= ruleDependency EOF )
            // InternalDependency.g:66:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // InternalDependency.g:72:1: ruleDependency returns [EObject current=null] : ( ( (lv_flatDependency_0_0= ruleFlatDependency ) ) | ( (lv_hierarchicalDependencies_1_0= ruleHierarchicalDependency ) )+ ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        EObject lv_flatDependency_0_0 = null;

        EObject lv_hierarchicalDependencies_1_0 = null;



        	enterRule();

        try {
            // InternalDependency.g:78:2: ( ( ( (lv_flatDependency_0_0= ruleFlatDependency ) ) | ( (lv_hierarchicalDependencies_1_0= ruleHierarchicalDependency ) )+ ) )
            // InternalDependency.g:79:2: ( ( (lv_flatDependency_0_0= ruleFlatDependency ) ) | ( (lv_hierarchicalDependencies_1_0= ruleHierarchicalDependency ) )+ )
            {
            // InternalDependency.g:79:2: ( ( (lv_flatDependency_0_0= ruleFlatDependency ) ) | ( (lv_hierarchicalDependencies_1_0= ruleHierarchicalDependency ) )+ )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDependency.g:80:3: ( (lv_flatDependency_0_0= ruleFlatDependency ) )
                    {
                    // InternalDependency.g:80:3: ( (lv_flatDependency_0_0= ruleFlatDependency ) )
                    // InternalDependency.g:81:4: (lv_flatDependency_0_0= ruleFlatDependency )
                    {
                    // InternalDependency.g:81:4: (lv_flatDependency_0_0= ruleFlatDependency )
                    // InternalDependency.g:82:5: lv_flatDependency_0_0= ruleFlatDependency
                    {

                    					newCompositeNode(grammarAccess.getDependencyAccess().getFlatDependencyFlatDependencyParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_flatDependency_0_0=ruleFlatDependency();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDependencyRule());
                    					}
                    					set(
                    						current,
                    						"flatDependency",
                    						lv_flatDependency_0_0,
                    						"org.itea2.amalthea.variability.dependency.Dependency.FlatDependency");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDependency.g:100:3: ( (lv_hierarchicalDependencies_1_0= ruleHierarchicalDependency ) )+
                    {
                    // InternalDependency.g:100:3: ( (lv_hierarchicalDependencies_1_0= ruleHierarchicalDependency ) )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==12) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalDependency.g:101:4: (lv_hierarchicalDependencies_1_0= ruleHierarchicalDependency )
                    	    {
                    	    // InternalDependency.g:101:4: (lv_hierarchicalDependencies_1_0= ruleHierarchicalDependency )
                    	    // InternalDependency.g:102:5: lv_hierarchicalDependencies_1_0= ruleHierarchicalDependency
                    	    {

                    	    					newCompositeNode(grammarAccess.getDependencyAccess().getHierarchicalDependenciesHierarchicalDependencyParserRuleCall_1_0());
                    	    				
                    	    pushFollow(FOLLOW_3);
                    	    lv_hierarchicalDependencies_1_0=ruleHierarchicalDependency();

                    	    state._fsp--;


                    	    					if (current==null) {
                    	    						current = createModelElementForParent(grammarAccess.getDependencyRule());
                    	    					}
                    	    					add(
                    	    						current,
                    	    						"hierarchicalDependencies",
                    	    						lv_hierarchicalDependencies_1_0,
                    	    						"org.itea2.amalthea.variability.dependency.Dependency.HierarchicalDependency");
                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleFlatDependency"
    // InternalDependency.g:123:1: entryRuleFlatDependency returns [EObject current=null] : iv_ruleFlatDependency= ruleFlatDependency EOF ;
    public final EObject entryRuleFlatDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlatDependency = null;


        try {
            // InternalDependency.g:123:55: (iv_ruleFlatDependency= ruleFlatDependency EOF )
            // InternalDependency.g:124:2: iv_ruleFlatDependency= ruleFlatDependency EOF
            {
             newCompositeNode(grammarAccess.getFlatDependencyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFlatDependency=ruleFlatDependency();

            state._fsp--;

             current =iv_ruleFlatDependency; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFlatDependency"


    // $ANTLR start "ruleFlatDependency"
    // InternalDependency.g:130:1: ruleFlatDependency returns [EObject current=null] : (otherlv_0= '[FlatDependency]' ( (lv_systemPart_1_0= ruleSystemPart ) ) ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleFlatDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_systemPart_1_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalDependency.g:136:2: ( (otherlv_0= '[FlatDependency]' ( (lv_systemPart_1_0= ruleSystemPart ) ) ( (lv_type_2_0= ruleType ) ) ) )
            // InternalDependency.g:137:2: (otherlv_0= '[FlatDependency]' ( (lv_systemPart_1_0= ruleSystemPart ) ) ( (lv_type_2_0= ruleType ) ) )
            {
            // InternalDependency.g:137:2: (otherlv_0= '[FlatDependency]' ( (lv_systemPart_1_0= ruleSystemPart ) ) ( (lv_type_2_0= ruleType ) ) )
            // InternalDependency.g:138:3: otherlv_0= '[FlatDependency]' ( (lv_systemPart_1_0= ruleSystemPart ) ) ( (lv_type_2_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFlatDependencyAccess().getFlatDependencyKeyword_0());
            		
            // InternalDependency.g:142:3: ( (lv_systemPart_1_0= ruleSystemPart ) )
            // InternalDependency.g:143:4: (lv_systemPart_1_0= ruleSystemPart )
            {
            // InternalDependency.g:143:4: (lv_systemPart_1_0= ruleSystemPart )
            // InternalDependency.g:144:5: lv_systemPart_1_0= ruleSystemPart
            {

            					newCompositeNode(grammarAccess.getFlatDependencyAccess().getSystemPartSystemPartParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_systemPart_1_0=ruleSystemPart();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFlatDependencyRule());
            					}
            					set(
            						current,
            						"systemPart",
            						lv_systemPart_1_0,
            						"org.itea2.amalthea.variability.dependency.Dependency.SystemPart");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDependency.g:161:3: ( (lv_type_2_0= ruleType ) )
            // InternalDependency.g:162:4: (lv_type_2_0= ruleType )
            {
            // InternalDependency.g:162:4: (lv_type_2_0= ruleType )
            // InternalDependency.g:163:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getFlatDependencyAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFlatDependencyRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.itea2.amalthea.variability.dependency.Dependency.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFlatDependency"


    // $ANTLR start "entryRuleHierarchicalDependency"
    // InternalDependency.g:184:1: entryRuleHierarchicalDependency returns [EObject current=null] : iv_ruleHierarchicalDependency= ruleHierarchicalDependency EOF ;
    public final EObject entryRuleHierarchicalDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHierarchicalDependency = null;


        try {
            // InternalDependency.g:184:63: (iv_ruleHierarchicalDependency= ruleHierarchicalDependency EOF )
            // InternalDependency.g:185:2: iv_ruleHierarchicalDependency= ruleHierarchicalDependency EOF
            {
             newCompositeNode(grammarAccess.getHierarchicalDependencyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHierarchicalDependency=ruleHierarchicalDependency();

            state._fsp--;

             current =iv_ruleHierarchicalDependency; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHierarchicalDependency"


    // $ANTLR start "ruleHierarchicalDependency"
    // InternalDependency.g:191:1: ruleHierarchicalDependency returns [EObject current=null] : (otherlv_0= '[HierarchicalDependency]' (otherlv_1= '(Exclusive)' )? ( (lv_systemPart_2_0= ruleSystemPart ) ) otherlv_3= 'StructureElements:' ( (lv_structureElements_4_0= ruleStructureElement ) )+ otherlv_5= 'Properties:' ( (lv_properties_6_0= ruleProperty ) )+ ) ;
    public final EObject ruleHierarchicalDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_systemPart_2_0 = null;

        EObject lv_structureElements_4_0 = null;

        EObject lv_properties_6_0 = null;



        	enterRule();

        try {
            // InternalDependency.g:197:2: ( (otherlv_0= '[HierarchicalDependency]' (otherlv_1= '(Exclusive)' )? ( (lv_systemPart_2_0= ruleSystemPart ) ) otherlv_3= 'StructureElements:' ( (lv_structureElements_4_0= ruleStructureElement ) )+ otherlv_5= 'Properties:' ( (lv_properties_6_0= ruleProperty ) )+ ) )
            // InternalDependency.g:198:2: (otherlv_0= '[HierarchicalDependency]' (otherlv_1= '(Exclusive)' )? ( (lv_systemPart_2_0= ruleSystemPart ) ) otherlv_3= 'StructureElements:' ( (lv_structureElements_4_0= ruleStructureElement ) )+ otherlv_5= 'Properties:' ( (lv_properties_6_0= ruleProperty ) )+ )
            {
            // InternalDependency.g:198:2: (otherlv_0= '[HierarchicalDependency]' (otherlv_1= '(Exclusive)' )? ( (lv_systemPart_2_0= ruleSystemPart ) ) otherlv_3= 'StructureElements:' ( (lv_structureElements_4_0= ruleStructureElement ) )+ otherlv_5= 'Properties:' ( (lv_properties_6_0= ruleProperty ) )+ )
            // InternalDependency.g:199:3: otherlv_0= '[HierarchicalDependency]' (otherlv_1= '(Exclusive)' )? ( (lv_systemPart_2_0= ruleSystemPart ) ) otherlv_3= 'StructureElements:' ( (lv_structureElements_4_0= ruleStructureElement ) )+ otherlv_5= 'Properties:' ( (lv_properties_6_0= ruleProperty ) )+
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getHierarchicalDependencyAccess().getHierarchicalDependencyKeyword_0());
            		
            // InternalDependency.g:203:3: (otherlv_1= '(Exclusive)' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDependency.g:204:4: otherlv_1= '(Exclusive)'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getHierarchicalDependencyAccess().getExclusiveKeyword_1());
                    			

                    }
                    break;

            }

            // InternalDependency.g:209:3: ( (lv_systemPart_2_0= ruleSystemPart ) )
            // InternalDependency.g:210:4: (lv_systemPart_2_0= ruleSystemPart )
            {
            // InternalDependency.g:210:4: (lv_systemPart_2_0= ruleSystemPart )
            // InternalDependency.g:211:5: lv_systemPart_2_0= ruleSystemPart
            {

            					newCompositeNode(grammarAccess.getHierarchicalDependencyAccess().getSystemPartSystemPartParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_systemPart_2_0=ruleSystemPart();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHierarchicalDependencyRule());
            					}
            					set(
            						current,
            						"systemPart",
            						lv_systemPart_2_0,
            						"org.itea2.amalthea.variability.dependency.Dependency.SystemPart");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getHierarchicalDependencyAccess().getStructureElementsKeyword_3());
            		
            // InternalDependency.g:232:3: ( (lv_structureElements_4_0= ruleStructureElement ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDependency.g:233:4: (lv_structureElements_4_0= ruleStructureElement )
            	    {
            	    // InternalDependency.g:233:4: (lv_structureElements_4_0= ruleStructureElement )
            	    // InternalDependency.g:234:5: lv_structureElements_4_0= ruleStructureElement
            	    {

            	    					newCompositeNode(grammarAccess.getHierarchicalDependencyAccess().getStructureElementsStructureElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_structureElements_4_0=ruleStructureElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getHierarchicalDependencyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"structureElements",
            	    						lv_structureElements_4_0,
            	    						"org.itea2.amalthea.variability.dependency.Dependency.StructureElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getHierarchicalDependencyAccess().getPropertiesKeyword_5());
            		
            // InternalDependency.g:255:3: ( (lv_properties_6_0= ruleProperty ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDependency.g:256:4: (lv_properties_6_0= ruleProperty )
            	    {
            	    // InternalDependency.g:256:4: (lv_properties_6_0= ruleProperty )
            	    // InternalDependency.g:257:5: lv_properties_6_0= ruleProperty
            	    {

            	    					newCompositeNode(grammarAccess.getHierarchicalDependencyAccess().getPropertiesPropertyParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_properties_6_0=ruleProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getHierarchicalDependencyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_6_0,
            	    						"org.itea2.amalthea.variability.dependency.Dependency.Property");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHierarchicalDependency"


    // $ANTLR start "entryRuleSystemPart"
    // InternalDependency.g:278:1: entryRuleSystemPart returns [EObject current=null] : iv_ruleSystemPart= ruleSystemPart EOF ;
    public final EObject entryRuleSystemPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemPart = null;


        try {
            // InternalDependency.g:278:51: (iv_ruleSystemPart= ruleSystemPart EOF )
            // InternalDependency.g:279:2: iv_ruleSystemPart= ruleSystemPart EOF
            {
             newCompositeNode(grammarAccess.getSystemPartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystemPart=ruleSystemPart();

            state._fsp--;

             current =iv_ruleSystemPart; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystemPart"


    // $ANTLR start "ruleSystemPart"
    // InternalDependency.g:285:1: ruleSystemPart returns [EObject current=null] : (otherlv_0= 'SystemPart:' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSystemPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDependency.g:291:2: ( (otherlv_0= 'SystemPart:' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalDependency.g:292:2: (otherlv_0= 'SystemPart:' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalDependency.g:292:2: (otherlv_0= 'SystemPart:' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalDependency.g:293:3: otherlv_0= 'SystemPart:' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getSystemPartAccess().getSystemPartKeyword_0());
            		
            // InternalDependency.g:297:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDependency.g:298:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDependency.g:298:4: (lv_name_1_0= RULE_ID )
            // InternalDependency.g:299:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSystemPartAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSystemPartRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystemPart"


    // $ANTLR start "entryRuleType"
    // InternalDependency.g:319:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalDependency.g:319:45: (iv_ruleType= ruleType EOF )
            // InternalDependency.g:320:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalDependency.g:326:1: ruleType returns [EObject current=null] : (otherlv_0= 'Type:' ( (lv_type_1_0= RULE_ID ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_type_1_0=null;


        	enterRule();

        try {
            // InternalDependency.g:332:2: ( (otherlv_0= 'Type:' ( (lv_type_1_0= RULE_ID ) ) ) )
            // InternalDependency.g:333:2: (otherlv_0= 'Type:' ( (lv_type_1_0= RULE_ID ) ) )
            {
            // InternalDependency.g:333:2: (otherlv_0= 'Type:' ( (lv_type_1_0= RULE_ID ) ) )
            // InternalDependency.g:334:3: otherlv_0= 'Type:' ( (lv_type_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeAccess().getTypeKeyword_0());
            		
            // InternalDependency.g:338:3: ( (lv_type_1_0= RULE_ID ) )
            // InternalDependency.g:339:4: (lv_type_1_0= RULE_ID )
            {
            // InternalDependency.g:339:4: (lv_type_1_0= RULE_ID )
            // InternalDependency.g:340:5: lv_type_1_0= RULE_ID
            {
            lv_type_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_type_1_0, grammarAccess.getTypeAccess().getTypeIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleStructureElement"
    // InternalDependency.g:360:1: entryRuleStructureElement returns [EObject current=null] : iv_ruleStructureElement= ruleStructureElement EOF ;
    public final EObject entryRuleStructureElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructureElement = null;


        try {
            // InternalDependency.g:360:57: (iv_ruleStructureElement= ruleStructureElement EOF )
            // InternalDependency.g:361:2: iv_ruleStructureElement= ruleStructureElement EOF
            {
             newCompositeNode(grammarAccess.getStructureElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStructureElement=ruleStructureElement();

            state._fsp--;

             current =iv_ruleStructureElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStructureElement"


    // $ANTLR start "ruleStructureElement"
    // InternalDependency.g:367:1: ruleStructureElement returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleStructureElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDependency.g:373:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDependency.g:374:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDependency.g:374:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDependency.g:375:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDependency.g:375:3: (lv_name_0_0= RULE_ID )
            // InternalDependency.g:376:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getStructureElementAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStructureElementRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStructureElement"


    // $ANTLR start "entryRuleProperty"
    // InternalDependency.g:395:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalDependency.g:395:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalDependency.g:396:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalDependency.g:402:1: ruleProperty returns [EObject current=null] : (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) ( (lv_comparismOperator_2_0= ruleComparismOperator ) ) ( (lv_value_3_0= rulePropertyValue ) ) ( (lv_description_4_0= ruleDescription ) )? otherlv_5= ')' ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_5=null;
        Enumerator lv_comparismOperator_2_0 = null;

        EObject lv_value_3_0 = null;

        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalDependency.g:408:2: ( (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) ( (lv_comparismOperator_2_0= ruleComparismOperator ) ) ( (lv_value_3_0= rulePropertyValue ) ) ( (lv_description_4_0= ruleDescription ) )? otherlv_5= ')' ) )
            // InternalDependency.g:409:2: (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) ( (lv_comparismOperator_2_0= ruleComparismOperator ) ) ( (lv_value_3_0= rulePropertyValue ) ) ( (lv_description_4_0= ruleDescription ) )? otherlv_5= ')' )
            {
            // InternalDependency.g:409:2: (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) ( (lv_comparismOperator_2_0= ruleComparismOperator ) ) ( (lv_value_3_0= rulePropertyValue ) ) ( (lv_description_4_0= ruleDescription ) )? otherlv_5= ')' )
            // InternalDependency.g:410:3: otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) ( (lv_comparismOperator_2_0= ruleComparismOperator ) ) ( (lv_value_3_0= rulePropertyValue ) ) ( (lv_description_4_0= ruleDescription ) )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPropertyAccess().getLeftParenthesisKeyword_0());
            		
            // InternalDependency.g:414:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDependency.g:415:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDependency.g:415:4: (lv_name_1_0= RULE_ID )
            // InternalDependency.g:416:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDependency.g:432:3: ( (lv_comparismOperator_2_0= ruleComparismOperator ) )
            // InternalDependency.g:433:4: (lv_comparismOperator_2_0= ruleComparismOperator )
            {
            // InternalDependency.g:433:4: (lv_comparismOperator_2_0= ruleComparismOperator )
            // InternalDependency.g:434:5: lv_comparismOperator_2_0= ruleComparismOperator
            {

            					newCompositeNode(grammarAccess.getPropertyAccess().getComparismOperatorComparismOperatorEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_comparismOperator_2_0=ruleComparismOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyRule());
            					}
            					set(
            						current,
            						"comparismOperator",
            						lv_comparismOperator_2_0,
            						"org.itea2.amalthea.variability.dependency.Dependency.ComparismOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDependency.g:451:3: ( (lv_value_3_0= rulePropertyValue ) )
            // InternalDependency.g:452:4: (lv_value_3_0= rulePropertyValue )
            {
            // InternalDependency.g:452:4: (lv_value_3_0= rulePropertyValue )
            // InternalDependency.g:453:5: lv_value_3_0= rulePropertyValue
            {

            					newCompositeNode(grammarAccess.getPropertyAccess().getValuePropertyValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_value_3_0=rulePropertyValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPropertyRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"org.itea2.amalthea.variability.dependency.Dependency.PropertyValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDependency.g:470:3: ( (lv_description_4_0= ruleDescription ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDependency.g:471:4: (lv_description_4_0= ruleDescription )
                    {
                    // InternalDependency.g:471:4: (lv_description_4_0= ruleDescription )
                    // InternalDependency.g:472:5: lv_description_4_0= ruleDescription
                    {

                    					newCompositeNode(grammarAccess.getPropertyAccess().getDescriptionDescriptionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_description_4_0=ruleDescription();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPropertyRule());
                    					}
                    					set(
                    						current,
                    						"description",
                    						lv_description_4_0,
                    						"org.itea2.amalthea.variability.dependency.Dependency.Description");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPropertyAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleDescription"
    // InternalDependency.g:497:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalDependency.g:497:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalDependency.g:498:2: iv_ruleDescription= ruleDescription EOF
            {
             newCompositeNode(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescription=ruleDescription();

            state._fsp--;

             current =iv_ruleDescription; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalDependency.g:504:1: ruleDescription returns [EObject current=null] : (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ')' ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDependency.g:510:2: ( (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ')' ) )
            // InternalDependency.g:511:2: (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ')' )
            {
            // InternalDependency.g:511:2: (otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ')' )
            // InternalDependency.g:512:3: otherlv_0= '(' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDescriptionAccess().getLeftParenthesisKeyword_0());
            		
            // InternalDependency.g:516:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDependency.g:517:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDependency.g:517:4: (lv_name_1_0= RULE_ID )
            // InternalDependency.g:518:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDescriptionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDescriptionAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRulePropertyValue"
    // InternalDependency.g:542:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalDependency.g:542:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalDependency.g:543:2: iv_rulePropertyValue= rulePropertyValue EOF
            {
             newCompositeNode(grammarAccess.getPropertyValueRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyValue=rulePropertyValue();

            state._fsp--;

             current =iv_rulePropertyValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyValue"


    // $ANTLR start "rulePropertyValue"
    // InternalDependency.g:549:1: rulePropertyValue returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDependency.g:555:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDependency.g:556:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDependency.g:556:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDependency.g:557:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDependency.g:557:3: (lv_name_0_0= RULE_ID )
            // InternalDependency.g:558:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getPropertyValueAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPropertyValueRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyValue"


    // $ANTLR start "ruleComparismOperator"
    // InternalDependency.g:577:1: ruleComparismOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '=>' ) | (enumLiteral_4= '<=' ) ) ;
    public final Enumerator ruleComparismOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDependency.g:583:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '=>' ) | (enumLiteral_4= '<=' ) ) )
            // InternalDependency.g:584:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '=>' ) | (enumLiteral_4= '<=' ) )
            {
            // InternalDependency.g:584:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '=>' ) | (enumLiteral_4= '<=' ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt7=1;
                }
                break;
            case 21:
                {
                alt7=2;
                }
                break;
            case 22:
                {
                alt7=3;
                }
                break;
            case 23:
                {
                alt7=4;
                }
                break;
            case 24:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDependency.g:585:3: (enumLiteral_0= '=' )
                    {
                    // InternalDependency.g:585:3: (enumLiteral_0= '=' )
                    // InternalDependency.g:586:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getComparismOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComparismOperatorAccess().getEQUALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDependency.g:593:3: (enumLiteral_1= '>' )
                    {
                    // InternalDependency.g:593:3: (enumLiteral_1= '>' )
                    // InternalDependency.g:594:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getComparismOperatorAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComparismOperatorAccess().getGREATEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDependency.g:601:3: (enumLiteral_2= '<' )
                    {
                    // InternalDependency.g:601:3: (enumLiteral_2= '<' )
                    // InternalDependency.g:602:4: enumLiteral_2= '<'
                    {
                    enumLiteral_2=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getComparismOperatorAccess().getLESSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getComparismOperatorAccess().getLESSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDependency.g:609:3: (enumLiteral_3= '=>' )
                    {
                    // InternalDependency.g:609:3: (enumLiteral_3= '=>' )
                    // InternalDependency.g:610:4: enumLiteral_3= '=>'
                    {
                    enumLiteral_3=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getComparismOperatorAccess().getGREATEREQUALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getComparismOperatorAccess().getGREATEREQUALEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDependency.g:617:3: (enumLiteral_4= '<=' )
                    {
                    // InternalDependency.g:617:3: (enumLiteral_4= '<=' )
                    // InternalDependency.g:618:4: enumLiteral_4= '<='
                    {
                    enumLiteral_4=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getComparismOperatorAccess().getLESSEQUALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getComparismOperatorAccess().getLESSEQUALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparismOperator"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001F00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});

}