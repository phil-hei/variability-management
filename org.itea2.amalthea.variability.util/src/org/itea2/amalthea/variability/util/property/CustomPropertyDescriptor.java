package org.itea2.amalthea.variability.util.property;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.impl.EAttributeImpl;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.yakindu.base.xtext.utils.jface.viewers.XtextStyledTextCellEditor;
import org.itea2.amalthea.variability.dependency.ui.internal.DependencyActivator;

import com.google.inject.Injector;

public class CustomPropertyDescriptor extends org.eclipse.emf.edit.ui.provider.PropertyDescriptor{

	public CustomPropertyDescriptor(AdapterFactory adapterFactory, Object object,
			IItemPropertyDescriptor itemPropertyDescriptor) {
		super(object, itemPropertyDescriptor);
	}

	public CellEditor createPropertyEditor(Composite composite) {
		CellEditor cellEditor = super.createPropertyEditor(composite);

		if (itemPropertyDescriptor.getFeature(object) instanceof EAttributeImpl) {
			EAttributeImpl attr = (EAttributeImpl) itemPropertyDescriptor.getFeature(object);
			if (attr.getContainerClass() == org.itea2.amalthea.variability.ample.Dependency.class
					&& attr.getName().equalsIgnoreCase("description")) {
				Injector injector = DependencyActivator.getInstance()
						.getInjector("org.itea2.amalthea.variability.dependency.Dependency");
				XtextStyledTextCellEditor xtextStyledTextCellEditor = new XtextStyledTextCellEditor(
						SWT.SINGLE, injector);
				xtextStyledTextCellEditor.create(composite);

				return xtextStyledTextCellEditor;
			}
		}
		return cellEditor;
	}
}
