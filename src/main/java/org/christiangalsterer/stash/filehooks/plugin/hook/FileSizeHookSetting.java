package org.christiangalsterer.stash.filehooks.plugin.hook;

import com.google.common.base.Strings;

import java.util.Optional;
import java.util.regex.Pattern;

public class FileSizeHookSetting {

    private Long size;
    private Pattern includePattern;
    private Optional<Pattern> excludePattern;
    private Optional<Pattern> branchesPattern;

    public FileSizeHookSetting(Long size, String includePattern, String excludePattern, String branchesPattern) {
        this.size = size;
        this.includePattern = Pattern.compile(includePattern);
        this.excludePattern = Strings.isNullOrEmpty(excludePattern) ? Optional.empty() : Optional.of(Pattern.compile(excludePattern));
        this.branchesPattern = Strings.isNullOrEmpty(branchesPattern) ? Optional.empty() : Optional.of(Pattern.compile(branchesPattern));

    }

    public Long getSize() {
        return size;
    }

    public Pattern getIncludePattern() {
        return includePattern;
    }

    public Optional<Pattern> getExcludePattern() {
        return excludePattern;
    }

    public Optional<Pattern> getBranchesPattern() { return branchesPattern; }

}
