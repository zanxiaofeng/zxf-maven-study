package zxf.maven.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import javax.annotation.Resource;
import java.io.File;
import java.util.List;

@Mojo(name = "zxf")
public class ZxfMojo extends AbstractMojo {

    @Parameter( defaultValue = "${project.build.sourceDirectory}", required = true )
    private File sourceDirectory;

    @Parameter( defaultValue = "${project.build.resources}", required = true )
    private List<Resource> resources;

    @Parameter( defaultValue = "${project.build.directory}", property = "outputDir", required = true )
    private File outputDirectory;

    public void execute() throws MojoExecutionException {
        System.out.println("$$$$$$$$$$$$$$$$$$$$teste$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
    }
}
