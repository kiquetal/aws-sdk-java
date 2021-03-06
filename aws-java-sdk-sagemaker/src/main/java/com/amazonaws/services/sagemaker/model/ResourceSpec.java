/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance. The ARN is
 * stored as metadata in SageMaker Studio notebooks.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ResourceSpec" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceSpec implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SageMaker image created on the instance.
     * </p>
     */
    private String sageMakerImageArn;
    /**
     * <p>
     * The instance type.
     * </p>
     */
    private String instanceType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SageMaker image created on the instance.
     * </p>
     * 
     * @param sageMakerImageArn
     *        The Amazon Resource Name (ARN) of the SageMaker image created on the instance.
     */

    public void setSageMakerImageArn(String sageMakerImageArn) {
        this.sageMakerImageArn = sageMakerImageArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SageMaker image created on the instance.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the SageMaker image created on the instance.
     */

    public String getSageMakerImageArn() {
        return this.sageMakerImageArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SageMaker image created on the instance.
     * </p>
     * 
     * @param sageMakerImageArn
     *        The Amazon Resource Name (ARN) of the SageMaker image created on the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceSpec withSageMakerImageArn(String sageMakerImageArn) {
        setSageMakerImageArn(sageMakerImageArn);
        return this;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @param instanceType
     *        The instance type.
     * @see AppInstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @return The instance type.
     * @see AppInstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @param instanceType
     *        The instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppInstanceType
     */

    public ResourceSpec withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @param instanceType
     *        The instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppInstanceType
     */

    public ResourceSpec withInstanceType(AppInstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSageMakerImageArn() != null)
            sb.append("SageMakerImageArn: ").append(getSageMakerImageArn()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceSpec == false)
            return false;
        ResourceSpec other = (ResourceSpec) obj;
        if (other.getSageMakerImageArn() == null ^ this.getSageMakerImageArn() == null)
            return false;
        if (other.getSageMakerImageArn() != null && other.getSageMakerImageArn().equals(this.getSageMakerImageArn()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSageMakerImageArn() == null) ? 0 : getSageMakerImageArn().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        return hashCode;
    }

    @Override
    public ResourceSpec clone() {
        try {
            return (ResourceSpec) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ResourceSpecMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
