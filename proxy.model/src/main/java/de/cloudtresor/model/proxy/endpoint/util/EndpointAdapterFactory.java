/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cloudtresor.model.proxy.endpoint.util;

import de.cloudtresor.model.proxy.ConfigurationItem;

import de.cloudtresor.model.proxy.endpoint.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.cloudtresor.model.proxy.endpoint.EndpointPackage
 * @generated
 */
public class EndpointAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EndpointPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EndpointPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndpointSwitch<Adapter> modelSwitch =
		new EndpointSwitch<Adapter>() {
			@Override
			public Adapter caseEndpointConfiguration(EndpointConfiguration object) {
				return createEndpointConfigurationAdapter();
			}
			@Override
			public Adapter caseLocalEndpointConfiguration(LocalEndpointConfiguration object) {
				return createLocalEndpointConfigurationAdapter();
			}
			@Override
			public Adapter caseLocalHTTPEndpointConfiguration(LocalHTTPEndpointConfiguration object) {
				return createLocalHTTPEndpointConfigurationAdapter();
			}
			@Override
			public Adapter caseLocalSSLEndpointConfiguration(LocalSSLEndpointConfiguration object) {
				return createLocalSSLEndpointConfigurationAdapter();
			}
			@Override
			public Adapter caseLocalTSTPEndpointConfiguration(LocalTSTPEndpointConfiguration object) {
				return createLocalTSTPEndpointConfigurationAdapter();
			}
			@Override
			public Adapter caseRemoteEndpointConfiguration(RemoteEndpointConfiguration object) {
				return createRemoteEndpointConfigurationAdapter();
			}
			@Override
			public Adapter caseRemoteHTTPEndpointConfiguration(RemoteHTTPEndpointConfiguration object) {
				return createRemoteHTTPEndpointConfigurationAdapter();
			}
			@Override
			public Adapter caseRemoteSSLEndpointConfiguration(RemoteSSLEndpointConfiguration object) {
				return createRemoteSSLEndpointConfigurationAdapter();
			}
			@Override
			public Adapter caseRemoteTSTPEndpointConfiguration(RemoteTSTPEndpointConfiguration object) {
				return createRemoteTSTPEndpointConfigurationAdapter();
			}
			@Override
			public <C extends SSLConfiguration> Adapter caseSecureEndpointConfiguration(SecureEndpointConfiguration<C> object) {
				return createSecureEndpointConfigurationAdapter();
			}
			@Override
			public <C extends SSLConfiguration> Adapter caseTSTPEndpointConfiguration(TSTPEndpointConfiguration<C> object) {
				return createTSTPEndpointConfigurationAdapter();
			}
			@Override
			public Adapter caseSSLConfiguration(SSLConfiguration object) {
				return createSSLConfigurationAdapter();
			}
			@Override
			public Adapter caseClientSSLConfiguration(ClientSSLConfiguration object) {
				return createClientSSLConfigurationAdapter();
			}
			@Override
			public Adapter caseServerSSLConfiguration(ServerSSLConfiguration object) {
				return createServerSSLConfigurationAdapter();
			}
			@Override
			public Adapter caseConfigurationItem(ConfigurationItem object) {
				return createConfigurationItemAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.endpoint.EndpointConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.endpoint.EndpointConfiguration
	 * @generated
	 */
	public Adapter createEndpointConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.endpoint.LocalEndpointConfiguration <em>Local Endpoint Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.endpoint.LocalEndpointConfiguration
	 * @generated
	 */
	public Adapter createLocalEndpointConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.endpoint.LocalHTTPEndpointConfiguration <em>Local HTTP Endpoint Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.endpoint.LocalHTTPEndpointConfiguration
	 * @generated
	 */
	public Adapter createLocalHTTPEndpointConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.endpoint.LocalSSLEndpointConfiguration <em>Local SSL Endpoint Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.endpoint.LocalSSLEndpointConfiguration
	 * @generated
	 */
	public Adapter createLocalSSLEndpointConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.endpoint.LocalTSTPEndpointConfiguration <em>Local TSTP Endpoint Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.endpoint.LocalTSTPEndpointConfiguration
	 * @generated
	 */
	public Adapter createLocalTSTPEndpointConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.endpoint.RemoteEndpointConfiguration <em>Remote Endpoint Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.endpoint.RemoteEndpointConfiguration
	 * @generated
	 */
	public Adapter createRemoteEndpointConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.endpoint.RemoteHTTPEndpointConfiguration <em>Remote HTTP Endpoint Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.endpoint.RemoteHTTPEndpointConfiguration
	 * @generated
	 */
	public Adapter createRemoteHTTPEndpointConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.endpoint.RemoteSSLEndpointConfiguration <em>Remote SSL Endpoint Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.endpoint.RemoteSSLEndpointConfiguration
	 * @generated
	 */
	public Adapter createRemoteSSLEndpointConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.endpoint.RemoteTSTPEndpointConfiguration <em>Remote TSTP Endpoint Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.endpoint.RemoteTSTPEndpointConfiguration
	 * @generated
	 */
	public Adapter createRemoteTSTPEndpointConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.endpoint.SecureEndpointConfiguration <em>Secure Endpoint Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.endpoint.SecureEndpointConfiguration
	 * @generated
	 */
	public Adapter createSecureEndpointConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.endpoint.TSTPEndpointConfiguration <em>TSTP Endpoint Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.endpoint.TSTPEndpointConfiguration
	 * @generated
	 */
	public Adapter createTSTPEndpointConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.endpoint.SSLConfiguration <em>SSL Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.endpoint.SSLConfiguration
	 * @generated
	 */
	public Adapter createSSLConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.endpoint.ClientSSLConfiguration <em>Client SSL Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.endpoint.ClientSSLConfiguration
	 * @generated
	 */
	public Adapter createClientSSLConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.endpoint.ServerSSLConfiguration <em>Server SSL Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.endpoint.ServerSSLConfiguration
	 * @generated
	 */
	public Adapter createServerSSLConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.cloudtresor.model.proxy.ConfigurationItem <em>Configuration Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cloudtresor.model.proxy.ConfigurationItem
	 * @generated
	 */
	public Adapter createConfigurationItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EndpointAdapterFactory
